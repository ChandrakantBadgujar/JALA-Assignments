package _11_this_Super;

public class _06_Child_Class extends _06_Methods_notIn_constructro{
	
	public _06_Child_Class(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println("Doing something in My ChildClass");
        super.doSomething();
    }

    public void doSomethingElse() {
        System.out.println("Doing something else in My ChildClass");
        this.doSomething();
    }
    
    public static void main(String[] args) {
    	_06_Child_Class obj = new _06_Child_Class("example");
        obj.doSomethingElse();
    }
}
