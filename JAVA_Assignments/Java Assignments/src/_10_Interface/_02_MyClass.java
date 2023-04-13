package _10_Interface;

public class _02_MyClass implements _02_Interface_two_method {
	public void method1() {
		System.out.println("This is method 1");
	}
	public void method2() {
		System.out.println("This is method 1");
	}



	public static void main(String[] args) {
		_02_MyClass myObj = new _02_MyClass();
		myObj.method1();
		myObj.method2();
	}
}
