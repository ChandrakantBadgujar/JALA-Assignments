package _01_java_Basics;

public class _5_Local_global_Variable {

	
		    int var = 5; // global variable
		    
		    public void method() {
		        int var = 10; // local variable
		        
		        System.out.println("Local var: " + var); // output: Local var: 10
		        System.out.println("Global var: " + this.var); // output: Global var: 5
		    }
	

	

}
