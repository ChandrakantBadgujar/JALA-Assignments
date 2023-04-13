package _11_this_Super;

public class _01_Print_field_Instance_Using_this {
	
	private int x=10;
    private String y="Java";
    
    public void printFields() {
        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
    }
    
    public static void main(String[] args) {
    	_01_Print_field_Instance_Using_this obj= new _01_Print_field_Instance_Using_this();
    	obj.printFields();
    }

}
