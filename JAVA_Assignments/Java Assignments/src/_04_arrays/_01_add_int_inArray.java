package _04_arrays;

public class _01_add_int_inArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        
        System.out.println("Sum of array elements: " + sum);
    }

}
