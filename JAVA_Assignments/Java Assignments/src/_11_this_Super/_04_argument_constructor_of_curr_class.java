package _11_this_Super;

public class _04_argument_constructor_of_curr_class {
	private int myValue;

    public _04_argument_constructor_of_curr_class() {
        this(15); 
    }

    public _04_argument_constructor_of_curr_class(int value) {
        this.myValue = value;
    }
    
    public static void main(String[] args) {
    	_04_argument_constructor_of_curr_class obj= new _04_argument_constructor_of_curr_class();
    	
    	System.out.println(obj.myValue);
    }
}
