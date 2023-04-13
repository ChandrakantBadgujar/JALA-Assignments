package _04_arrays;

public class _05_Remove_specific_Element {

	public static int[] removeElement(int[] arr, int elem) {
	    
	    int index = -1;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == elem) {
	            index = i;
	            break;
	        }
	    }

	    
	    if (index == -1) {
	        return arr;
	    }

	    
	    int[] newArr = new int[arr.length - 1];
	    
	    int j = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (i == index) {
	            continue;
	        }
	        newArr[j++] = arr[i];
	    }
	    return newArr;
	}
	
}
