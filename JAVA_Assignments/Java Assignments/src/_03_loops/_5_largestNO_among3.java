package _03_loops;

public class _5_largestNO_among3 {

	public static void main(String[] args) {
		
		int[] numbers = {24,75,29};
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number is : " + largest);
    }

}
