package _04_arrays;

public class _16_array_contain_specific_element {
	
	
	public static boolean containsTwoElements(int[] arr) {
	    boolean contains12 = false;
	    boolean contains23 = false;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == 12) {
	            contains12 = true;
	        } else if (arr[i] == 23) {
	            contains23 = true;
	        }
	        if (contains12 && contains23) {
	            return true;
	        }
	    }
	    return false;
	}
	public static void main (String[] args) {
		int[] arr = {1, 4, 12, 8, 23, 7};
		
		if (containsTwoElements(arr)) {
		    System.out.println("The array contains both 12 and 23");
		} else {
		    System.out.println("The array does not contain both 12 and 23");
		}
	}

}
