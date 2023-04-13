package _04_arrays;

public class _15_difference_largest_Smallest_value {

	public static int getDifference(int[] arr) {
	    int max = arr[0];
	    int min = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	        if (arr[i] < min) {
	            min = arr[i];
	        }
	    }
	    return max - min;
	}
	public static void main (String[] args) {
		int[] arr = {4, 7, 1, 9, 3};
		
		int difference = getDifference(arr);
		
		System.out.println("Difference: " + difference);
	}
}
