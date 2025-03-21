package Task5;

import java.util.*;


public class Nonempty {

	public static void main(String[] args) {
		
		List <String> list = Arrays.asList("abc","","bc","efg","abcd","","jkl");//Created a list
		
		List<String> nonemptyStrings = list.stream()//Stream of list is created
			.filter(n -> !n.isEmpty())//Filter the list if it non empty
			.toList();//Terminal method to assign it to list
		
		System.out.println(nonemptyStrings);
	}

}
