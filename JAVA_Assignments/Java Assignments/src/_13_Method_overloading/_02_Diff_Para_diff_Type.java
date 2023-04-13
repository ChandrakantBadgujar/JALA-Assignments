package _13_Method_overloading;

public class _02_Diff_Para_diff_Type {
	
	public static void printMessage(String message) {
	    System.out.println(message);
	  }
	  
	  public static void printMessage(int number) {
	    System.out.println("The number is: " + number);
	  }
	  
	  public static void main(String[] args) {
	    printMessage("My Roll Number!"); 
	    printMessage(42); 
	  }

}
