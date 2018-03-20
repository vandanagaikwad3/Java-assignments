import java.util.Scanner;

/**
 * 
 */

/**
 * @author vandana c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
     		   --> One Function should swap the numbers without any third new variable.
      		 --> Second function should swap the numbers using a third variable.
 *
 */


import java.util.Scanner;

public class SwapNumbthree {
	
		
	public static void main(String args[]){
	
	
		Scanner data = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("value of a");
		a= data.nextInt();
		System.out.println("value of b" );
		b= data.nextInt();
		swapnum( a,  b);
		swapnumtwo( a,  b);
	}
	
	public static void swapnum(int numa, int numb)
	{
		int c=0;
		c= numa;
		numa = numb;
		numb = c;
		System.out.println("value of a" +numa);
		System.out.println("value of b" +numb);
		
	}
	
	public static void swapnumtwo(int numa, int numb)
	{
		
		numb= numa+numb;
		numa= numb-numa;
		numb= numb-numa;
		System.out.println("value of a" +numa);
		System.out.println("value of b" +numb);
		
	}
}
	/**
	 * @param args
	 */
	


