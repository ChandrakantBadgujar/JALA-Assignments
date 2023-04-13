package _10_Interface;

public class _06_MyClass implements _06_Inherit_interface_Child {
	
	public void eat() {
	    System.out.println("I am Eating");
	  }
	public void sleep() {
		System.out.println("I am Sleeping");
	  }
	  
	  public void fly() {
		  System.out.println("I am flying");
	  }
	  
	  public static void main (String[] args) {
		  _06_MyClass obj1= new _06_MyClass();
		  obj1.eat();
		  obj1.sleep();
		  obj1.fly();
	  }
}
