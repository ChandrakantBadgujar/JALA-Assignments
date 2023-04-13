package _03_loops;

public class _10_Find_Palindrome_orNot {

	public static void main(String[] args) {
		
		int rev,sum=0,temp;
		int num=151;
		temp=num;
		
		while (num>0) {
			rev=num%10;
			sum=(sum*10)+rev;
			num=num/10;
		}
		
		if (temp==sum) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}

	}
}
