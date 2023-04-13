package _08_Access_modifiers;

public class _01_Private_method {

	private int priField1;
	private String priField2;

	private void privateMethod() {
		System.out.println("This is a private method.");
	}

	public static void main(String[] args) {
		_01_Private_method obj = new _01_Private_method();
		obj.priField1 = 10;
		obj.priField2 = "JAVA";
		System.out.println("Private field 1: " + obj.priField1);
		System.out.println("Private field 2: " + obj.priField2);
		obj.privateMethod();
	}

}
