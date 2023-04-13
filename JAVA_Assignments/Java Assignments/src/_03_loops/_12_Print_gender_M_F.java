package _03_loops;

public class _12_Print_gender_M_F {

	public static void main(String[] args) {
		
		String input = "M";

        switch(input) {
            case "M":
                System.out.println("Male");
                break;
            case "F":
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

	}

}
