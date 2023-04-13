package _10_Interface;

public class _03_Inteface_Instance_Class implements _03_Interface_Instance {
	
	public void myMethod() {
        System.out.println("I am Interface");
    }
	
	
	public static void main( String[] args) {
		_03_Inteface_Instance_Class myInstance= new _03_Inteface_Instance_Class();
		myInstance.myMethod();
	}
}
