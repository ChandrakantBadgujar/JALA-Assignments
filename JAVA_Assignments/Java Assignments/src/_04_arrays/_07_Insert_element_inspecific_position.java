package _04_arrays;

public class _07_Insert_element_inspecific_position {

	public static int[] insertElement(int[] arr, int element, int index) {
	    
	    int[] result = new int[arr.length + 1];
	    
	    
	    for (int i = 0; i < index; i++) {
	        result[i] = arr[i];
	    }
	    
	    
	    result[index] = element;
	    
	    for (int i = index + 1; i < result.length; i++) {
	        result[i] = arr[i - 1];
	    }
	    
	    return result;
	}
}
