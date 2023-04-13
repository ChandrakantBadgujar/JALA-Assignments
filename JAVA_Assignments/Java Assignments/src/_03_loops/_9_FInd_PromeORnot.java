package _03_loops;

public class _9_FInd_PromeORnot {

	public static void main(String[] args) {
		
		int num = 17; 
        boolean Prime = true;
        
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                Prime = false;
                break;
            }
        }
        
        if (Prime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
   
	}

}
