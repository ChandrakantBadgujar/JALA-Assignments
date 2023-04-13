package _11_this_Super;

public class _03_Calling_constructor {

	private int number;
    private String text;


	public _03_Calling_constructor() {
        
		
        this(6, "JAvav");
	}
	public _03_Calling_constructor(int number, String text) {
        this.number = number;
        this.text = text;
	
	}
	
	public static void main(String[] args) {
        
		_03_Calling_constructor obj1 = new _03_Calling_constructor();
        System.out.println("obj1: " + obj1.number + ", " + obj1.text);

    }
}


