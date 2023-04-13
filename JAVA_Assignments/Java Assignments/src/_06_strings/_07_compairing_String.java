package _06_strings;

public class _07_compairing_String {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";

		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.startsWith("Hello"));
		
		System.out.println(s2.endsWith("world"));
		
		System.out.println(s2.compareTo(s1));

	}

}
