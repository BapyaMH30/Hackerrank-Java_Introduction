import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_End-of-file {

    public static void main(String[] args) {

    	String t = null;
    	    try {
    	        Scanner scanner = new Scanner(System.in);
    	        int count = 0;
    	        do {
    	            t= scanner.nextLine();
    	            count++;
    	            System.out.println(count +" "+t);
    	        }while (!t.endsWith("end-of-file."));
    	        scanner.close();
    	    } catch (Exception e) {
    	        // TODO Auto-generated catch block
    	        e.printStackTrace();
    	    }
    }
}
