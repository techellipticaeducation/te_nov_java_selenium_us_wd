package operators;

public class UnaryOperator {
public static void main(String[] args) {
	// UNry operator are those operator which dont need another operand
	// + - ++ -- !
//	int i = +10;
//	System.out.println(i);
	
	int i = 10;
	
	
	//i = i + 1;
//	i++; // post increment
//	++i; // pre increment
	
	int j = i++    +     i++   +     ++i;
	
	
	
	
	
	// increment by 1
	System.out.println("i - "+ i);
	System.out.println("j - "+ j);
	// these increases are of 2 types (increase , assignment)
	// pre-increment - first increase then assign 
	// post-increment - first assign then increase
	
	
	
	
}
}
