package _10_Interface;

public class _11_MyClass  implements _11_Interface_with_static_final{
	public void num (){
	int value= _11_Interface_with_static_final.numberr;
	
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		_11_MyClass obj= new _11_MyClass();
		obj.num();
		
	}
}