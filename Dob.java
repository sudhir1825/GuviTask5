package Task5;

import java.time.*;
import java.util.Scanner;

public class Dob {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//Scanner to get an input
		LocalDate date = LocalDate.now();//LocalDate class used to get current date,month and year 
		
		System.out.print("Enter your BirthDate[yyyy/mm/dd]: ");//get input from user
		
		String dateFormat = sc.next();
		String [] separate = dateFormat.split("-");//Spilt and store in an String array 
		
		int year = date.getYear() - (Integer.parseInt(separate[0]));//Calculate the year
		
		int month = 0;//Calculate the month 
		month = (date.getMonthValue() < (Integer.parseInt(separate[1]))?
				12-((Integer.parseInt(separate[1]))-date.getMonthValue()):
				date.getMonthValue() - (Integer.parseInt(separate[1])));
		
		if(year==1)//check if the year is previous year (to avoid edge cases)
			year = date.getMonthValue()==(Integer.parseInt(separate[1]))?1:0;
		
		int dates = 0; //Calculate the date
		dates = date.getDayOfMonth() < (Integer.parseInt(separate[2]))?
				(Integer.parseInt(separate[2])) - date.getDayOfMonth():
				date.getDayOfMonth() - (Integer.parseInt(separate[2]));
		
		System.out.println(year+" years,"+month+" months,"+dates+" days.");//Print the output in the given format
	}

}
