package _14_Exception;


public class _07_finally_block {

	public static void main(String[] args) {
		try {
			
			int result = 1 / 0;
		} catch (ArithmeticException e) {
			
			System.out.println("An error occurred: " + e.getMessage());
		} finally {
			
			System.out.println("This is the finally block.");
		}
	}
}
