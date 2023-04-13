package _04_arrays;

public class _13_second_largest_num {

	public static int findSecondLargest(int[] arr) {
	    int largest = arr[0];
	    int secondLargest = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > largest) {
	            secondLargest = largest;
	            largest = arr[i];
	        } else if (arr[i] > secondLargest && arr[i] != largest) {
	            secondLargest = arr[i];
	        }
	    }
	    return secondLargest;
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5 };
		int secondLargest = findSecondLargest(arr);
		System.out.println("Second largest number is: " + secondLargest);
	}
}
