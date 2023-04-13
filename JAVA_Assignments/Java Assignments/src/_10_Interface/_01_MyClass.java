package _10_Interface;

public class _01_MyClass implements _01_Interface_one_method{
	public void doSomething() {
        System.out.println("This is Interface class");
    }



    public static void main(String[] args) {
    	_01_Interface_one_method myObject = new _01_MyClass();
        myObject.doSomething(); 
    }
   }
    
