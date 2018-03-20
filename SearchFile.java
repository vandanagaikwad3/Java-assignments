/**
 * 
 */

/**
 * @author vandana
 *
 */
import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class SearchFile {
	public static void main(String[] args) {
		
		 try {
			    String nameOfFile = "C:\\\\jnr\\\\sample.txt";
			    String string;
	            System.out.println("Enter data to search");
	            Scanner sc = new Scanner(System.in);
	            String word = sc.next();
	             
	            BufferedReader br = new BufferedReader(new FileReader(nameOfFile));
	             
	            while((string = br.readLine()) != null){
	                String starr[] = string.split(" ");
	                 
	                for (String string2 : starr) {
	                    if(string2.matches(word)){
	                        System.out.println("Found record for " +word);
	                    } else {
	                        System.out.println("Searching...");
	                    }
	                }
	            }   System.out.println("Done");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	         
	    }
        
    

}


