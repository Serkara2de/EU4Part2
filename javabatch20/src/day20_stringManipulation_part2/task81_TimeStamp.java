package day20_stringManipulation_part2;

public class task81_TimeStamp {

	public static void main(String[] args) {
		// Write a method that accept the date with date and creates a dateStamp for your automation report.
		
		String date = "27/10/2020 22:39:00";
		System.out.println(dateStamp(date));
		
		

	}

	public static String dateStamp(String date) {
		date=date.replace("/", "").replace(" ", "").replace(":", "");
		//System.out.println(date);
		return date;
		
	}

}

