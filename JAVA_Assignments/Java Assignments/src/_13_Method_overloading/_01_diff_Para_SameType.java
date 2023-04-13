package _13_Method_overloading;

public class _01_diff_Para_SameType {

	public static void main(String[] args) {
		_01_diff_Para_SameType example = new _01_diff_Para_SameType();


		example.printMessage("Hello");


		example.printMessage("Hello", "World");
	}

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printMessage(String message1, String message2) {
		System.out.println(message1 + " " + message2);
	}

}
