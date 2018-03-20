import java.util.Scanner;

public class MergeArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
	        int n,i,j, temp,n1,n2; 
	         int count=0;
	         Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of elements in the first array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.print("Enter number of elements in the second array:");
	        n1 = s.nextInt();
	      
	        int b[] = new int[n];
	        System.out.println("Enter elements of  first array:");
	        for( i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        System.out.println("Enter elements of  second array:");
	        for( i = 0; i < n1; i++)
	        {
	            b[i] = s.nextInt();
	        }
	        
	        n2=n+n1;
	        int c[] = new int[n2];
	        for(i=0; i<n; i++)
	        {
	        	      	
	        		c[i]=a[i];
	        		count++;
	        		
	        	
	        }
	        
	        for(i=0; i<n1; i++)
	        	
	        {
	        	c[count]=b[i];
	        	count++;
	        	
	        } 	
	        	
	        
	        System.out.println("Merge array:");
	        for( i = 0; i < n2; i++)
	        {
	        	 System.out.println(+c[i]);
	        }

}
}
}
	