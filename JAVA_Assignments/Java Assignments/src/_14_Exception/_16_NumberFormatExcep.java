package _14_Exception;

public class _16_NumberFormatExcep {
	
	public static void main(String[] args) {
        String str = "abc123"; 
       
        int num = Integer.parseInt(str); 
        
        System.out.println("Parsed integer: " + num);
    }

}
