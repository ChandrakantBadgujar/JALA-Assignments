package _02_operators;

public class _5_Logical_AND_OR_NOT {

	public static void main(String[] args) {
	// AND Operator
		
		int num1 = 5;
        int num2 = 10;
        if (num1 > 0 && num2 > 0) {
            System.out.println("Both numbers are positive.");
        } else {
            System.out.println("At least one number is not positive.");
        }
        
     // OR Operator
        int num3 = -5;
        int num4 = 10;
        if (num3 > 0 || num4 > 0) {
            System.out.println("At least one number is positive.");
        } else {
            System.out.println("Both numbers are not positive.");
        }
        
    // NOT Operator
        
        boolean isTrue = true;
        if (!isTrue) {
            System.out.println("The value is false.");
        } else {
            System.out.println("The value is true.");
        }
        

	}

}
