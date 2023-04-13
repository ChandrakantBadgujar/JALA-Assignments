package _14_Exception;

public class _13_NoSuchField_excep {

	public static void main(String[] args) {
		try {
			
			Object obj = new Object();
			obj.getClass().getField("nonExistentField");
		}
		catch (NoSuchFieldException e) {

			System.out.println(" NoSuchFieldException: " + e.getMessage());
		}
	}

}
