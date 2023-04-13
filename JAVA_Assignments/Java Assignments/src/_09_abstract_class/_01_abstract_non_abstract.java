package _09_abstract_class;

public abstract class _01_abstract_non_abstract {
	
	protected String sonu;

    public _01_abstract_non_abstract(String name) {
        this.sonu = name;
    }

    public void eat(String food) {
        System.out.println(sonu + " is eating " + food);
    }

    public abstract void makeSound();

}
