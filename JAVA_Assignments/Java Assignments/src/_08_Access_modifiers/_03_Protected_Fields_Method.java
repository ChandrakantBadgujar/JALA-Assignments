package _08_Access_modifiers;

public class _03_Protected_Fields_Method {
	
	protected String protField1;
	   protected int protField2;
	   
	   protected void protMethod1() {
	      System.out.println("This is Protected method 1");
	   }
	   
	   protected void protMethod2() {
	      System.out.println("This is Prorected Method 2");
	   }
	   
	   public void accessProtFieldsAndMethods() {
		   _03_Protected_Fields_Method parent = new _03_Protected_Fields_Method();
		      
		   String fieldValue = parent.protField1;
		      
		   parent.protMethod1();
		   System.out.println(parent);
		   }
	   	   
} 
