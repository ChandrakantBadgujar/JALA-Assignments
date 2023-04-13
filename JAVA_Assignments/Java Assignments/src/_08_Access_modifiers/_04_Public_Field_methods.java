package _08_Access_modifiers;

public class _04_Public_Field_methods {

	public int publicField;

	public void publicMethod() {
		System.out.println("Java Practice");
	}

	public static void main(String[] args) {
		_04_Public_Field_methods myObject = new _04_Public_Field_methods();

		myObject.publicField = 62;
		System.out.println(myObject.publicField);

		myObject.publicMethod();
	}

}
