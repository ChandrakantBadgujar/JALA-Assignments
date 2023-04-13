package _12_Constructor;

public class _03_access_modifire_in_constructor {

	private int privateVar;
	public String publicVar;
	protected double protectedVar;
	int defaultVar; // default access modifier

	private _03_access_modifire_in_constructor(int privateVar, String publicVar, double protectedVar, int defaultVar) {
		this.privateVar = privateVar;
		this.publicVar = publicVar;
		this.protectedVar = protectedVar;
		this.defaultVar = defaultVar;
	}

	public static void main(String[] args) {
		_03_access_modifire_in_constructor myObj = new _03_access_modifire_in_constructor(1, "I am Dipak", 3.14, 42);
		
		System.out.println(myObj.privateVar); // error: privateVar has private access in MyClass

		System.out.println(myObj.publicVar); 

		System.out.println(myObj.protectedVar); // error: protectedVar has protected access in MyClass

		System.out.println(myObj.defaultVar); 
	}
}
