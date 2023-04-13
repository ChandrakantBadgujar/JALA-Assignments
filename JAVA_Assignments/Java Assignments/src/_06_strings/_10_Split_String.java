package _06_strings;

public class _10_Split_String {

	public static void main(String[] args) {
		
		String str = "Hi,My,Name,is,Suresh";
        String[] strArray = str.split(",");
        
        for (String s : strArray) {
            System.out.println(s);
        }

	}

}
