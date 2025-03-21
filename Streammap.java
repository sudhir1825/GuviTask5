package Task5;
import java.util.*;
import java.util.stream.*;
public class Streammap {

	public static void main(String[] args) {
		
		Stream stream = Stream.of("aBc","d","ef");//Stream of list
		
		List<String> result = stream//Stream object 
				.map(n -> n.toString().toUpperCase())//Used map() to convert the String into uppercase
				.toList();//Terminal method to assign it to list
		
		System.out.println("After coverting the stream of string to upper case: "+result);//prints the result
	}

}
	