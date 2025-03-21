package Task5;

import java.util.*;

public class Category {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Adithi","Atchinthya","Sweatha","Hindu"
				,"Imaya","Evara","Sudhir","Kavana","Amutha","Aarusamy");//Created a list with Students name
		
		List<String> Anames = names.stream()//Stream created 
			.filter(n -> n.startsWith("a")||n.startsWith("A"))//Filter with String starts with 'a' or 'A'
			.toList();//Terminal method to assign it to list
		
		System.out.println("Students names Starting with Alphabet 'A' is:\n\n"+Anames);
					
	}

}
