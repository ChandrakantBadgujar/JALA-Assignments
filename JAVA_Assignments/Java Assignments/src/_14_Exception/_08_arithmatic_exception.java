package _14_Exception;

public class _08_arithmatic_exception {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		try {
			int result = a / b;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("This is ArithmeticException : " + e.getMessage());
		}

	}

}
