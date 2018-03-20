/**
 * 
 */

/**
 //* @author vandana
 *
 */
import java.io.*;
public class Arith_Oper {
	
	
	public static void main(String[] args) throws java.io.IOException{
	int choice;

	BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

	System.out.println("Enter 1st number:");
	String fst = stdin.readLine();
	int x = Integer.parseInt(fst);

	System.out.println("Enter second number:");
	String snd = stdin.readLine();
	int y = Integer.parseInt(snd);

	do{
		System.out.println("[1] Add");
		System.out.println("[2] Subtract");
		System.out.println("[3] Multiply");
		System.out.println("[4] Divide");
		System.out.println("Choice:");
		//choice = (intr) System.in.read();
		String choi = stdin.readLine();
	    choice = Integer.parseInt(choi);
		}while(choice!=5);

		//int sum=x+y;
	    int sum;
		switch(choice){
		case 1: 
		        sum=x+y; 
			
		        System.out.println(" Sum"+sum);
		        break;

		case 2: 
			sum=x-y; 
			
	        System.out.println(" Sum"+sum);
	        break;

		case 3: sum=x*y; 
		
        System.out.println(" Sum"+sum);
        break;

		case 4: sum=x/y; 
		
        System.out.println(" Sum"+sum);
        break;

		default: System.out.println("Invalid input!");
		}
		}
		} 

	
	