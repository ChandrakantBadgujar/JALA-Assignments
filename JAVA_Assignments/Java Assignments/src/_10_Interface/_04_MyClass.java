package _10_Interface;

public class _04_MyClass implements _04_two_interface_with_one_method_1,_04_two_interface_with_one_method_2{
	
	@Override 
	public void method1() {
        System.out.println("This is method 1.");
    }

    @Override
    public void method2() {
        System.out.println("This is method 2.");
    }
    
    public static void main(String[] args) {
    	_04_MyClass myObject = new _04_MyClass();
       
    	myObject.method1(); 
      
        myObject.method2(); 
    }
}
