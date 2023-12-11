package methods;

public class MethodCallTest1 {
	
	// can we stop our code without executing main method in java
	
	static {
		System.out.println("Hello1");
		System.exit(1); // Kills the JVM
	}
	public static void main(String[] args) {
		
		System.out.println("Hello2");
		
		// test1
//		Test5 t1 = new Test5();
//		Test5 t2 = new Test5();
//		Test5 t3 = new Test5();
//		t1.test1();
		

//		Test5.test2();
		// Sequence of loading entities
		// static - varibale, blocks and method (class)
		// instance - varibale , blocks and method (object we are creating)
		
		// j , static {} , test2() , 
		// i , {} , test1()
		
		// in static method only allow static entities,
		// non-static method allow both static and instance
	}
}


class Test5{

	int i = j;
	static int j = 10;
	
	// When you are going to create object of class,
//	this block will automatically execute
	{
		System.out.println("hello");
	}
	
	static {
		System.out.println(j);
		System.out.println("static hello");
	}
	
	
	
	void test1() {
		System.out.println(i);
		System.out.println(j);
		
	}
	
	static void test2() {	
		System.out.println(j);	
	}
	
	
	
	
}