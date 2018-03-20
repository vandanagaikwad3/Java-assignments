import java.util.ArrayList;

import java.util.List; 

public class JavaArraylist {
	
	
		public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>(); 
		numbers.add(1);
		numbers.add(2); 
		numbers.add(3); 
		System.out.println("ArrayList contains : " + numbers); 
		
		
		numbers.remove(1); //removing object at index 1 i.e. 2nd Object, which is 2 //Calling remove(object) 
		numbers.remove(3);

		
		

	}

}

