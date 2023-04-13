package _12_Constructor;

public class _01_defoult_constructor {
	private int value1;
    private int value2;
    
    public _01_defoult_constructor() {
        value1 = 0;
        value2 = 0;
    }
    
    public _01_defoult_constructor(int value1) {
        this.value1 = value1;
        value2 = 0;
    }
    
    
    public _01_defoult_constructor(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public int getValue1() {
        return value1;
    }
    
    public int getValue2() {
        return value2;
    }
    
    public static void main(String[] args) {
        
    	_01_defoult_constructor obj1 = new _01_defoult_constructor();
        System.out.println("obj1 value1: " + obj1.getValue1()); 
        System.out.println("obj1 value2: " + obj1.getValue2()); 
        
        
        _01_defoult_constructor obj2 = new _01_defoult_constructor(5);
        System.out.println("obj2 value1: " + obj2.getValue1()); 
        System.out.println("obj2 value2: " + obj2.getValue2()); 
        
        
        _01_defoult_constructor obj3 = new _01_defoult_constructor(10, 20);
        System.out.println("obj3 value1: " + obj3.getValue1()); 
        System.out.println("obj3 value2: " + obj3.getValue2()); 
    }

}
