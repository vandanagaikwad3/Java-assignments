import java.lang.*;
import java.io.*;
import java.util.*;
public class ReplacString {
	
		   public static void main(String args[]){
		      String str = "Hello";
		     System.out.println( str.replace( 'o','W' ) );//replace only one character
		    
		     System.out.println( str.replaceAll("He", "wa") );// replace substring or full string
		   }
		}


