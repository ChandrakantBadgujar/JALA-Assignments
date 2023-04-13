package _04_arrays;

public class _11_common_value_bt_twoArrays {

	public static void main(String[] args) {
		
		  int[] arr1 = {1, 2, 3, 4, 5};
	      int[] arr2 = {3, 4, 5, 6, 7};
	      
	      for (int i = 0; i < arr1.length; i++) {
	         for (int j = 0; j < arr2.length; j++) {
	            if (arr1[i] == arr2[j]) {
	               System.out.println("Comman Values between Arrays are :"+arr1[i]);
	            }
	         }
	      }

	}

}
