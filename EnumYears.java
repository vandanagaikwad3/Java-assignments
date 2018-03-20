/**
 * 
 */

/**
 * @author vandana
 *
 */
//f. Write a program that defines an enum having months of the year and then prints the value of all the enum elements.
public class EnumYears {
	enum Months{   
		January(1), Febuary(2), March(3), April(4), May(5), June(6), July(7),August(8),September(9), October(10), November(11), December(12)  ;   
		  
		private int value;  
		private Months(int value){  
		this.value=value;  
		}  
		}  
		public static void main(String args[]){  
		for (Months s : Months.values())  
		System.out.println(s+" "+s.value);  

	}

}
