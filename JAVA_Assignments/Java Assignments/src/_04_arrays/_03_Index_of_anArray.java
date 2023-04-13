package _04_arrays;

public class _03_Index_of_anArray {

	public static void main(String[] args) {
		
		int[] arr = { 6, 14,25, 27, 35 };
        int element = 25;
        int index = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println("Element " + element + " is found at index " + index);
        } else {
            System.out.println("Element not found");
        }

	}

}
