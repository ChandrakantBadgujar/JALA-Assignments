package _14_Exception;

public class _05_Excep_with_own_msg {

	public static void main(String[] args) {
		try {
			throw new Exception("This is my custom error message.");
		} catch (Exception e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
	}

}
