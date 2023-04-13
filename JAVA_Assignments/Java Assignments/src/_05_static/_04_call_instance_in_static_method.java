package _05_static;

public class _04_call_instance_in_static_method {

	
	 public void instanceMethod() {
	      System.out.println("Instance method called");
	    }
	    
	 public static void staticMethod() {
		 _04_call_instance_in_static_method obj = new _04_call_instance_in_static_method();
	      obj.instanceMethod();
	    }
	
}
