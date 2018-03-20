/**
 * 
 */

/**
 * @author vandana
 *
 */
public class Fibbonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =1;
		int b =0;
		int c =0;
		int n =5;
		int i =0;
		
		System.out.print(+a);
		for(i=1; i<n; i++)
		{
			c=a+b;
			System.out.print(" "+c);
			b=a;
			a=c;
		}
		
			
	}

}
