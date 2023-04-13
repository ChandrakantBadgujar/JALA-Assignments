package _14_Exception;

public class _10_ClassNotFoundExcep {
	
	public static void main(String[] args) {
	      try {
	         
	         Class.forName("NonExistentClass");
	      } catch (ClassNotFoundException e) {
	         
	         e.printStackTrace();
	      }
	   }

}
