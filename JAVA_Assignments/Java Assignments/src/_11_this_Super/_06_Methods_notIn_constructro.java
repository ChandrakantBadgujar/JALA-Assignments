package _11_this_Super;

public class _06_Methods_notIn_constructro {
	
	private String name;

    public _06_Methods_notIn_constructro(String name) {
        this.name = name;
    }

    public void doSomething() {
        System.out.println("Doing something in Parent Class");
        this.doSomethingElse();
    }

    public void doSomethingElse() {
        System.out.println("Doing something else in  Parent Class");
    }

}
