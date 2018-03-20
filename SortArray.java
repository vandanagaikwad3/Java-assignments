import java.util.Scanner;


public class SortArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{ int n, temp, i, j;
				
         Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for( i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        for( i = 0; i < n; i++)
        	
        {
        	for(j=i+1; j<n; j++)
        	if(a[i]>a[j])
        	{
        	  temp=a[i];
        	  a[i]=a[j];	
        	  a[j]=temp;
        	}
        }	
        
        System.out.println("sorted array");
        
        for( i = 0; i < n; i++)
        	
        {
        	
        	 System.out.println(+a[i]);
        	 
        }	
        		
        	}
        }

	}


