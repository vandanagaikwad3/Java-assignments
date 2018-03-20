import java.util.Scanner;  
public class InputString {
	//c. Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 
		   Scanner sc=new Scanner(System.in);  
		     		   
		   System.out.println("Enter string");  
		   String name=sc.nextLine();  
		   
		
		   System.out.println( name.replaceAll("This is nice", "This1 is1 nice1 ") );
		 
		   sc.close();  
		 }  
		
	}


