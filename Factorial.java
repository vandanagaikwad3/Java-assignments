/**
 * 
 */

/**
 //* @author vandana
 *
 */
import java.util.Scanner;
public class Factorial {
	
	 public static int fact(int n){ 
	
	if(n==0)
	{
		return 1;
	}
	else
	{	

	return n* fact(n-1);
	
	 }	
	 }	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		int facts;
		Scanner data = new Scanner(System.in);
		
		// TODO Auto-generated method stub
       System.out.print("Enter value of n : " );
       	n =data.nextInt();
       	 facts = fact(n);
       	System.out.print("Factoial"+facts );
       
	}

}
