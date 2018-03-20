/**
 * 
 */

/**
 * @author vandana
 *
 */
public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int i;
		int n=0;
		int m;
		int count = 0;
		for (n=3;n<=100;n++)
					
		{  
			m=n/2;
			
			for(i=2;i<=m;i++)
				{
					if(n%i==0)
					{	
					count++;
					break;
					}
					
								
				}
			
			if(count==0)
			{
				System.out.println(+n);
			}
			
			count=0;
		}
			
		
		}

}
	