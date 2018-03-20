import java.util.Scanner;

/**
 * 
 */

/**
 * @author vandana
 *
 */
public class ReveseindividualWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
		   
		   System.out.println("Enter string");  
		   String name=sc.nextLine(); 
		//String name=" Hello World";
		String reverse = "";
		    for(int i = name.length()-1; i >= 0; i--) {
		    	reverse = reverse + name.substring(i, i+1);
		    }        
		    System.out.println(reverse); 
		  sc.close();  
	}

}
