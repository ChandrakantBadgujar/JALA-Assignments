package _03_loops;

public class _3_Equal_notEqual_Operator {

	public static void main(String[] args) {
		
			int[] numbers = {1, 2, 3, 4, 5};

		    
		    System.out.println("Numbers that are equal to 3:");
		    for (int i = 0; i < numbers.length; i++) {
		      if (numbers[i] == 3) {
		        System.out.println(numbers[i]);
		      }
		    }

		    
		    System.out.println("Numbers that are not equal to 3:");
		    for (int i = 0; i < numbers.length; i++) {
		      if (numbers[i] != 3) {
		        System.out.println(numbers[i]);
		      }
		    }

	}

}
