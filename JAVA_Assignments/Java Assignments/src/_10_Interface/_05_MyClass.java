package _10_Interface;

public class _05_MyClass  implements InterfaceA, InterfaceB{
	
	public void printMessage() {
	      System.out.println("I am IInterface!");
	      
	   }
	
	public static void main(String[] args) {
		_05_MyClass myObj = new _05_MyClass();
	      myObj.printMessage();
	   }
}
