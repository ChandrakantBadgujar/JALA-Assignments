package _14_Exception;

public class _14_NoSuchMethod_ {

	public static void main(String[] args) {
		
		 try {
	         
	         someMethod();
	      } catch (NoSuchMethodException e) {
	         System.out.println("Caught NoSuchMethodException: " + e.getMessage());
	      }
	}

}
