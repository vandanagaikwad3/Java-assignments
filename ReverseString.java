/**
 * 
 */

/**
 * @author vandana
 *
 */
import java.lang.*;
import java.io.*;
import java.util.*;
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abc ="Hello";
		 
	        // convert String to character array
	        // by using toCharArray
	        char[] xyz = abc.toCharArray();
	 	        for (int i = xyz.length-1; i>=0; i--)
	 	        	  System.out.print(xyz[i]);
	    }
	}
		