import java.io.*;
import java.util.*;

public class NewClass_1 {

    public static void main(String[] args) {
      int y;
        Scanner s=new Scanner(System.in);
        int x = s.nextInt();
          y = s.nextInt();
int c=0;
boolean t=false;
char aa[]=new char[5];
        int m1 = 0,n1 = 0,m2 = 0,n2 = 0;
        String a[]=new String[5];
        for(int i=0;i<5;i++){
            a[i]=s.next();
              }
         for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(a[i].charAt(j)=='d'){
                    c+=1;
                }}}
         while(c>0){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(a[i].charAt(j)=='d'){
                   m2=i;
                    n2=j;
                    t=true;
                    j=6;
                    i=6;
                }
               }}
 	if(t==true){
        if(x>m2){
            for(int k=0;k<(x-m2);k++){
               if(x!=m2 || y!=n2){
            System.out.println("UP");
            x-=1;
                }    
        }}
        else if(x==m2){
    
}
        else{
              for(int l=0;l<(m2-x);l++){
                  if(x!=m2 || y!=n2){
            System.out.println("DOWN");
            x+=1;
                }   
        }            
        }
       if(y>n2){
            for(int b=0;b<(y-n2);b++){
                if(x!=m2 || y!=n2){
            System.out.println("LEFT");
            
            y-=1;
                }               
        }}
       else if(y==n2){
    
		}
         else{
              for(int v=0;v<(n2-y);v++){
                   if(x!=m2 || y!=n2){
            System.out.println("RIGHT");
            y+=1;
                }
          } 
        } 
        if(x==m2 && y==n2){
                System.out.println("CLEAN");
             aa=a[m2].toCharArray();
             
             aa[n2]='-';
             a[m2]="";
             for(int h=0;h<5;h++){
             a[m2]=a[m2]+aa[h];
                       
                     }
        t=false;
         c--; }

        }          
       }
     }
}
