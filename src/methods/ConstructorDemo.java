package methods;

public class ConstructorDemo {
	public static void main(String[] args) {
		Test90 t1 = new Test90(10,20);
		Test90 t2 = new Test90(10,20);
		t1.i = 30;
		t1.showValue();
		
		t2.i = 50;
		t2.showValue();
		
	}
}

class Test90{
	
	int i ; // instance variable
	
	void showValue() {
		int i = 40;// local variable
		// shadowing
		this.i = i;
		System.out.println(i);
		this.test();
	}	
	// When ever you are calling a constructor. it must be the first call
	Test90(){
		this(5);
		System.out.println("");
	}
	
	Test90(int i ){
		System.out.println(i);
	}
	
	Test90(int i, int j){
		System.out.println("Hello i am 2 constructor");
	}
	
	void Test90(int k) {
		
	}
	
	
	
	void test() {
		System.out.println("hello");
	}
	void test(int i) {
		System.out.println("hello");
	}
}
