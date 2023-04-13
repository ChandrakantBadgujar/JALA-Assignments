package _13_Method_overloading;

public class _04_same_para_diff_type {
	
	public static void print(int num) {
        System.out.println("The number is " + num);
    }

    public static void print(String str) {
        System.out.println("The string is " + str);
    }

    public static void main(String[] args) {
        int num = 193;
        String str = "My name Is Sonu!";
        
        
        print(num);
        
        
        print(str);
    }

}
