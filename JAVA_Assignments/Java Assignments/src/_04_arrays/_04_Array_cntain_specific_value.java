package _04_arrays;

public class _04_Array_cntain_specific_value {

	public static void main(String[] args) {
		
		 
        int[] numbers = { 5, 10, 15, 20, 25 };
        
        
        int searchValue = 15;
        
        boolean found = false;
               
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                found = true;
                break;
            }
        }
                
        if (found) {
            System.out.println("The array contains the value " + searchValue);
        } else {
            System.out.println("The array does not contain the value " + searchValue);
        }
	
}	

}

