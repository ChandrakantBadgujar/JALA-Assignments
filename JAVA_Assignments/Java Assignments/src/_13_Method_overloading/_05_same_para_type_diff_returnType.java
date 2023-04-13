package _13_Method_overloading;

public class _05_same_para_type_diff_returnType {
	
	public int add(int a, int b) {
        return a + b;
    }

    public double add(int a, int b) {
        return (double) (a + b);
    }
    
    public static void main(String[] args) {
    	_05_same_para_type_diff_returnType example = new _05_same_para_type_diff_returnType();
        
        int result1 = example.add(2, 3);  
        double result2 = example.add(2, 3);  
    }

}
