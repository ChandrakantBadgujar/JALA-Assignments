package _09_abstract_class;

public abstract class _02_subClass {

	protected String name;

	public _02_subClass(String name) {
		this.name = name;
	}

	// abstract method
	public abstract void makeSound();

	// non-abstract method
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	public class Dog extends _02_subClass {
		public Dog(String name) {
			super(name);
		}


		public void makeSound() {
			System.out.println(name + " barks");
		}

		public  void main(String[] args) {
			Dog myDog = new Dog("Rex");
			myDog.makeSound(); 
			myDog.sleep(); 
		}
	}



}
