package methods;

public class ConstructorDemo {
	public static void main(String[] args) {
		Test90 t1 = new Test90(10,20);
		
	}
}


class Test90{
	
	Test90(){
		System.out.println("Hello i am constructor");
	}
	
	Test90(int i ){
		System.out.println("Hello i am 1 constructor");
	}
	
	Test90(int i, int j){
		System.out.println("Hello i am 2 constructor");
	}
	
	void test() {
		System.out.println("hello");
	}
	void test(int i) {
		System.out.println("hello");
	}
}
