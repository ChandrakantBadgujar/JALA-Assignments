package _11_this_Super;

public class _02_Print_field_instance_usig_super {
	int a = 50;
    String b = "Cup";

}
	class Child extends _02_Print_field_instance_usig_super {
    int c = 20;

    void printParentFields() {
        System.out.println(super.a); 
        System.out.println(super.b); 
       
    }
   
    public static void main(String[] args) {
        Child obj = new Child();
        obj.printParentFields(); 
    }
}
	
