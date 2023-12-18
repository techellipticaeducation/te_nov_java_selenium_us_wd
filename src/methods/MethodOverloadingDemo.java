package methods;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// Polymorphism
		//float result = Calculator.sum(10, 20);
//		System.out.println(result);
		double  sum = Calculator.sum(10,20);  
	    System.out.println(sum);
	}
}
// method overloading - compile time polymorphism

class Calculator{
	// Method Overloading
	// same method name but differnt type of param and different number of param
	// method overloading doesnt depend on return type
	
	

		  static double sum(double i, double j){
		    System.out.println("double-double-");
		    return i+j;
		  }
	
}

