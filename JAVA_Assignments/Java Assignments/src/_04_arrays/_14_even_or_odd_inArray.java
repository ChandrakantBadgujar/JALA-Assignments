package _04_arrays;

public class _14_even_or_odd_inArray {

	public static void main(String[] args) {
		
		int arr[]= {6,1,45,7,5,4,7,5,6,3,1,4};
		
		for (int i=0; i<arr.length;i++) {
			if (arr[i] %2 == 0) {
				System.out.println("The Number is Even :" + arr[i]);
			}
			else {
				System.out.println("The Number is odd :"+ arr[i]);
			}
		}

	}

}
