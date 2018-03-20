/**
 * 
 */

/**
 * @author vandana
 *	b. Write a program print "fizz" if a number is divisible by 3,"buzz" if a number is divisible by 5, and "fizz buzz" if number is divisible by both, else print the number.
 */
public class Printbuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i=0;

	for(i=1;i<91;i++)
		//flag=false;
	    //flag1=false;
		
	{ 
		if(i % 3==0)
			
		{
			if(i % 5==0)
			{	
			System.out.println("fizzbuzz");
			
			}
			
			else
			{
				System.out.println("fizz");	
			}	
			
		}	
	  
	       else 
	       {   
	    	   if(i % 5==0)
			{
				System.out.println("buzz");	
			}
		
					else
			{
				System.out.println(+i);	
			}
		}
		}
					
	
}
	

	}
