import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java Loops {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        double sum=0;
        for(int i=0;i<x;i++)
        {
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	int n=sc.nextInt();
        	sum=a+b;
        	for (int j=1;j<=n;j++)
        	{
        		int k=(int)sum;
        		System.out.print(k+" ");
        		sum=sum+(Math.pow(2, j))*b;
        	}
            System.out.println("");

        }
    }
}
