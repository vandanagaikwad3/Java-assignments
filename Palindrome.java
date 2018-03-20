/**
 * 
 */

/**
 * @author vandana
 *
 */
import java.util.*;
 
public class Palindrome {
	
	public static void main(String[] args) {
	
	String original, rev = ""; // Objects of String class
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string ");
    original = in.nextLine();

    int length = original.length();

    for ( int i = length - 1; i >= 0; i-- )
       rev = rev + original.charAt(i);

    if (original.equals(rev))
       System.out.println("Entered string is a palindrome");
    else
       System.out.println("Entered string is not a palindrome.");

	

	}

}
