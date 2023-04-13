package _14_Exception;

import java.io.IOException;

public class _04_multiple_catch_box {

	public static void main(String[] args) {
		try {

			int x = 10 / 0; 
			throw new IOException(); 

		} catch (ArithmeticException e) {
			System.out.println(" ArithmeticException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println(" IOException: " + e.getMessage());
		} catch (Exception e) {
			System.out.println(" Exception: " + e.getMessage());
		}
	}

}
