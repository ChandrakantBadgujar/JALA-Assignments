package _09_abstract_class;

public abstract  class _03_Child_abstarct_method {
	
	abstract void makeSound();
}

class Dog extends _03_Child_abstarct_method {
	void makeSound() {
		System.out.println("Woof");
	}



	public static void main(String[] args) {
		
		Dog animal = new Dog(); // create instance for child class
		
		animal.makeSound(); // call abstract method
		System.out.println(animal);
	}
}
