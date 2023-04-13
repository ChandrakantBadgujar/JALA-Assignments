package _03_loops;

public class _11_Num_Eevn_odd_using_swicth {

	public static void main(String[] args) {
		
		int num = 11; 
        switch(num % 2) {
            case 0:
                System.out.println(num + " is even");
                break;
            case 1:
                System.out.println(num + " is odd");
                break;
        }

	}

}
