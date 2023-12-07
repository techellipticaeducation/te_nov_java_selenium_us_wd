package oops;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		// table for 7
		
		for(int i = 1 ; i <=10 ;i++) {
			int value = calc1.multiply(i, 7);
			System.out.println("7 * " + i + " = "+ value);
		}
		// Terminology
	}
}

class Calculator{

	int add(int value1, int value2){
		int sumValue = value1+value2;
		return sumValue;
	}
	
	
	// multiply method
	 int multiply(int value1, int value2) {
		int mulValue = value1*value2;
		return mulValue;
	}
	
	// some method dont have any parameter
	// non-parameterized method 
	double valueOfPI() {
		return 3.14d;
	}
	
	// no retrun type method
	// void method
	void test1() {
		System.out.println("sadas");
	}
}
