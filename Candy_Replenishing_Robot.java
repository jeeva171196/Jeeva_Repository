import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Candy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>=5 && n<=100){
        int temp=n,count=0;
        int t = in.nextInt();
        if(t>=1 && t<=100){
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
        for(int c_i=0;c_i<t;c_i++){
          if(c[c_i]<=temp){
              temp=temp-c[c_i];
          } 
          if(c_i+1<t && c[c_i+1]<=temp){
              continue;
                        }
          else if(c_i+1<t){
              count=count+(n-temp) ;
              temp=temp+(n-temp);
          }
        }
        System.out.println(count);
    }}}
}
