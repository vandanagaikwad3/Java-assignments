import java.util.Scanner;

/**
 * 
 */

/**
 * @author vandana
 *
 */
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		{ int n, e, temp;
		temp=0;
		
         Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Enter elements to be search in array:");
        e = s.nextInt();
        
        for(int i = 0; i < n; i++)
        { 
        	if(a[i]==e)
        	{
        		System.out.println("element found:"+i);	
        		temp++;
        	}
        
        }	        
        
        if(temp==0)
        {
        	System.out.println("element not found in array:");
        }
		// TODO Auto-generated method stub

	}

	}
	
}
