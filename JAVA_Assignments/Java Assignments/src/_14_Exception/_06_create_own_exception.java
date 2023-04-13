package _14_Exception;



public class _06_create_own_exception  extends Exception{

	public _06_create_own_exception(String message) {
		super(message);
	}

	public static void main(String[] args) {
		try {
			int num = 10;
			if (num > 5) {
				throw new _06_create_own_exception("Number greater than 5!");
			}
		} catch (_06_create_own_exception e) {
			System.out.println("This is CustomException: " + e.getMessage());
		}
	}
}
