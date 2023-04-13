package _05_static;

public class _05_call_static_method_in_instance_method {
	
	public static void staticMethod() {
        System.out.println("This is a static method.");
    }
    
    public void instanceMethod() {
        System.out.println("This is an instance method.");
        _05_call_static_method_in_instance_method.staticMethod(); 
    }
}
