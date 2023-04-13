package _09_abstract_class;

public abstract class _04_child_non_abstract_method {
	
	public void nonAbstractMethod() {
        System.out.println("This is a non-abstract method in the Parent class.");
    }
	
	class Child extends _04_child_non_abstract_method {
	    
	    public void callNonAbstractMethod() {
	        System.out.println("Calling the non-abstract method in the Child class:");
	        nonAbstractMethod();
	    }
	}
	
	public static void main(String[] args) {
        Child child = new Child();
        
        child.callNonAbstractMethod();
    }

}
