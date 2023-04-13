package _08_Access_modifiers;

public class _02_defult_field_method {

	int defaultIntField;
	String defaultStringField;

	void defaultMethod() {
		System.out.println("This is a default method");
	}

public static void main(String[] args) {

	_02_defult_field_method example = new _02_defult_field_method();

	example.defaultIntField = 42;
	example.defaultStringField = "Hi Java!";

	example.defaultMethod();
}

}
