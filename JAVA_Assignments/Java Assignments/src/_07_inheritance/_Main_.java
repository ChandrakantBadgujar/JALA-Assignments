package _07_inheritance;

public class _Main_ {

	public static void main(String[] args) {
		
		_A_ objA = new _A_();
		_B_ objB = new _B_();
		_C_ objC = new _C_();

		objA.methodA1();
		objA.methodA2();
		objA.overrideMethod();

		objB.methodB1();
		objB.methodB2();
		objB.overrideMethod();

		objC.methodC1();
		objC.methodC2();
		objC.overrideMethod();

		_A_ objSuperB = new _B_();
		objSuperB.overrideMethod();

		_A_ objSuperC = new _C_();
		objSuperC.overrideMethod();

		System.out.println(objA.a);
		System.out.println(objB.a);
		System.out.println(objB.b);
		System.out.println(objC.a);
		System.out.println(objC.b);
		System.out.println(objC.c);

	}

}
