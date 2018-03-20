import java.util.Scanner;

public class MissingNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 
		    {
		        int n, temp, temp1;
		         Scanner s = new Scanner(System.in);
		        System.out.print("Enter number of elements in the array:");
		        n = s.nextInt();
		        int a[] = new int[n];
		        System.out.println("Enter elements of array:");
		        for(int i = 0; i < n; i++)
		        {
		            a[i] = s.nextInt();
		        }
		        
		        for(int i = 0; i < n; i++)
		        {
		            if(a[i] < a[i+1])
		            {
		                if(a[i+1]-a[i]==1)
		                { temp= 0;
		                
		                }
		                else
		                {	
		                	temp=1;
		                	temp1= a[i+1];
		                	temp1=temp1-1;
		                	System.out.println("Missing Number:"+temp1);	
		                }
		                	
		            }
		        }
		        
		    }
		}

}
