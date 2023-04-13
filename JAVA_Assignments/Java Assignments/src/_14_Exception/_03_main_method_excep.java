package _14_Exception;

public class _03_main_method_excep {
	
	public static void main(String[] args) {
        
        myMethod();
    }

    
    public static void myMethod() throws IllegalArgumentException {
        throw new IllegalArgumentException("Oops, something went wrong!");
    }

}
