package _11_this_Super;

public class _05_Child_Class extends _05_parent_constructor_super {
	
	private int age;

    public _05_Child_Class(String name, int age) {
        super(name); 
        this.age = age;
    }

    public void printAge() {
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
    	_05_Child_Class child = new _05_Child_Class("Sonu", 15);
        child.printName(); 
        child.printAge(); 
    }

	
}
