package methods;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// Polymorphism
		//float result = Calculator.sum(10, 20);
//		System.out.println(result);
	}
}
// method overloading - compile time polymorphism

class Calculator{
	// Method Overloading
	// same method name but differnt type of param and different number of param
	// method overloading doesnt depend on return type
	
	static float sum(int i , float j) {
		System.out.println("m2");
		float k = i+j;
		return k;
	}
	
	static float sum(float i , int j) {
		System.out.println("m2");
		float k = i+j;
		return k;
	}
	
}

