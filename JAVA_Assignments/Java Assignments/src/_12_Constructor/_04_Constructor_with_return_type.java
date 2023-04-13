package _12_Constructor;

public class _04_Constructor_with_return_type {
	
	
	// constructor with a return type of int
	private int value;

    public int _04_Constructor_with_return_type(int v) {
        this.value = v;
        return this.value;
    }
    
    //constructor with a return type of String
    private String name;

    public _04_Constructor_with_return_type(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }
}
