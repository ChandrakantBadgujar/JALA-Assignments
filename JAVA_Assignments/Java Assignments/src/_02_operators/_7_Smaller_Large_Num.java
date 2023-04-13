package _02_operators;

public class _7_Smaller_Large_Num {

	public static void main(String[] args) {
		
		int a = 20;
        int b = 30;

        int smaller = a < b ? a : b;
        int larger = a > b ? a : b;

        System.out.println("Smaller number: " + smaller);
        System.out.println("Larger number: " + larger);

	}

}
