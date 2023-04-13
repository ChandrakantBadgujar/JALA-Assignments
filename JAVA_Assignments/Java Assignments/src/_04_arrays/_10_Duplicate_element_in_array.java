package _04_arrays;

public class _10_Duplicate_element_in_array {

	public static void main(String[] args) {
		
		int arr[] =new int[] {3,4,6,7,9,4,7,2,2};
		
		for (int i=0; i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate element is :" + arr[j]);
				}
			}
		}

	}

}
