package _06_strings;

public class _01_Create_strings {

	public static void main(String[] args) {
		
		String s1 = "Hello World";
		
		String s2 = new String("Hello World");
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		String s3 = sb.toString();
		System.out.println(s3);

	}

}
