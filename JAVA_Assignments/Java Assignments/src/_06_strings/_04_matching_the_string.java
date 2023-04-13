package _06_strings;

public class _04_matching_the_string {

	public static void main(String[] args) {
		
		String regex = "Chandrakant"; 
		String str = "hello world"; 

		boolean match = str.matches(regex); 

		if (match) {
		    System.out.println("The string matches the regular expression");
		} else {
		    System.out.println("The string does not match the regular expression.");
		}

	}

}
