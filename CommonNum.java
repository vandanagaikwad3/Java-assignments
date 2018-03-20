import java.util.Scanner;

/**
 * 
 */

/**
 * @author vandana
 *
 */
public class CommonNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
	        int n, temp; 
	         Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of elements in the array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        int b[] = new int[n];
	        System.out.println("Enter elements of  first array:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        System.out.println("Enter elements of  second array:");
	        for(int i = 0; i < n; i++)
	        {
	            b[i] = s.nextInt();
	        }
	        
	        for(int i = 0; i < n; i++)
	        	
	        {
	        	for (int j = 0; j < n; j++)
	        	{
	           if(a[i] == b[j])
	            {
	                temp=a[i];
	                System.out.println("Common:"+temp);
	                
	            }    
	        	}        
	           temp=0;     
	        }       	

	}
	}


}