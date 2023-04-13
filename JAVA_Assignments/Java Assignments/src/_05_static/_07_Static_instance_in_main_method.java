package _05_static;

public class _07_Static_instance_in_main_method {
	public static void main(String[] args) {
     
		
        int result = MyMath.add(2, 3);
        System.out.println("Result of adding 2 and 3 is " + result);

        
        _07_Static_instance_in_main_method myObject = new _07_Static_instance_in_main_method();
        String message = myObject.getMessage();
        System.out.println(message);
    }

    public String getMessage() {
        return "Hello World!";
    }
}

	class MyMath {
    public static int add(int a, int b) {
        return a + b;
    }
}
