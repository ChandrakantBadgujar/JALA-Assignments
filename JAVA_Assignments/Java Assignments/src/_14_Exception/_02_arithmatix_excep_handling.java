package _14_Exception;

public class _02_arithmatix_excep_handling {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		try {
			int c = a / b; 

			System.out.println("Result: " + c);
			} 
			catch (ArithmeticException e) {
			System.out.println("Exception : " + e);
			}

	}

}
