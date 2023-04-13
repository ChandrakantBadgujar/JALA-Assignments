package _05_static;

public class _06_all_static_Instance_method {
	
	static int staticVariable = 20;
    int instanceVariable = 30;

    public static void main(String[] args) {
        System.out.println("Static Variable: " + staticVariable);
        _06_all_static_Instance_method ex = new _06_all_static_Instance_method();
        System.out.println("Instance Variable: " + ex.instanceVariable);
    }

}
