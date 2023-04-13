package _04_arrays;

public class _06_copy_anather_array {
	
	public static void copyArray(int[] sourceArray, int[] destArray) {
	    
		
		for (int i = 0; i < sourceArray.length; i++) {
	        destArray[i] = sourceArray[i];
	    }
	}

}
