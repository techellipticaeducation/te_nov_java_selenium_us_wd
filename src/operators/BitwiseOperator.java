package operators;

public class BitwiseOperator {
	public static void main(String[] args) {
		System.out.println(TRUE() || FALSE());
	}
	
	
	public static boolean TRUE() {
		System.out.println("TRUE");
		return true;
	}
	public static boolean FALSE() {
		System.out.println("FALSE");
		return false;
	}
}
