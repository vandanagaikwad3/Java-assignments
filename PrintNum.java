

public class PrintNum {
public static void main(String[] args) {
		printNumber(1);
	}
 
	public static void printNumber(int number) {
		printNextNumber(number);	
	}
 
	private static void printNextNumber(int nextNumber) {
		if(nextNumber <= 100) {				
			System.out.println(nextNumber);
			nextNumber++;
			printNumber(nextNumber);		//Note: calls first method again
		}else {
			System.exit(0);
		}
		
	}		