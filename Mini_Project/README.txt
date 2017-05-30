=====================================================================================================================================================================         
						Commands for Run the Complete Project:
=====================================================================================================================================================================

Step 1: Install the Hadoop and Hive. Installation Video and Document  was Attached.

Step 2: Install Eclipse for Writing Map Reduce Program.

Step 3: To Start Hadoop
	 hdfs namenode –format
	 start-all.sh
	 jps

check whether the six nodes are present or not.

Step 4: Create java Project and write the Map Reduce Program that attached to the Document folder.

Step 5: Export the Java Project as Jar file save it in the path /home/hadoop/hadoop 2.7.3/bin/ for Implementation.

Step 6: Go to Hadoop folder using cd $HADOOP_HOME/bin command.

Step 7: Create a Directory in HDFS using hadoop fs -mkdir /sample Command.

Step 8: Move the Dtataset into HDFS Directory using hadoop fs -put /home/hadoop/Desktop/dataset.csv /sample/ Command.
	Using hadoop fs -ls /sample/ Command we can see what are the files in the HDFS Directory.

Step 9: Run the Map Reduce Program using hadoop jar final.jar incom.tax.prob.Tax /sample/dataset.csv out Command.

Goto the Browser and Download the output file.

Using cd command came out from the Hadooop folder.

=====================================================================================================================================================================
                				Hive Commands:
=====================================================================================================================================================================
Step 10: Goto Hive folder using cd $HIVE_HOME Command.

Step 11: Using hive command goto the hive database portal.

Step 12: Create Data base for Storing the resultant Dataset.
              create database Income;
              use Income;
Step 13: Create Table

create table details (State string, Tax bigint, Gender string, Age int) row format delimited fields terminated by ',' lines terminated by '\n' stored as textfile;
Store the Resultant dataset into Table.

load data local inpath '/home/hadoop/Desktop/Data' overwrite into table details;

Create new Table for Store the final Result of the Project.

create table taxdetails (State string, Tax bigint) stored as textfile;

Step 14: Execute the  Below Query for Final Result.

insert overwrite table taxdetails select State,sum(Tax) from details group by State;

select * from taxdetails;

=====================================================================================================================================================================
						Visualization: Tool Used – Splunk
=====================================================================================================================================================================

Install Splunk by using the procedure that Mentioned in the Document Which was attached.

Goto Browser and search the Splunk and get login.

Upload the Resultant Dataset into Splunk file system and search it.

Separate the data fields by using ‘,’ as Delimiter.

Goto option Visualization and set the fields Income tax to Y axis and State to X axis.

Finally the Visualizaton was Done.









