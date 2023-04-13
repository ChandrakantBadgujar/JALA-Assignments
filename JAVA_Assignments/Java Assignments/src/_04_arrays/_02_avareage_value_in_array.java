package _04_arrays;

public class _02_avareage_value_in_array {

	 public static void main(String[] args) {
	       int[] numbers = {5, 12, 19, 27, 35};

	      double sum = 0;
	      
	      for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }

	       double average = sum / numbers.length;

	        System.out.println("The average value of the array is: " + average);
	    }
	
}
