package _04_arrays;

public class _08_Find_Min_max_Element {

	public static void main(String[] args) {
			
			int arr[]= {3,4,7,8,1,20,45};		 
		    int min = arr[0];
		    int max = arr[0];
		    
		    for (int i = 1; i < arr.length; i++) {
		        if (arr[i] < min) {
		            min = arr[i];
		        }
		        if (arr[i] > max) {
		            max = arr[i];
		        }
		    }
		    
		    System.out.println("Minimum value: " + min);
		    System.out.println("Maximum value: " + max);
		
		
	}

}
