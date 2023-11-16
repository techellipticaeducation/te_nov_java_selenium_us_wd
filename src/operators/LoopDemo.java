package operators;

public class LoopDemo {
	public static void main(String[] args) {
		// What is Loop ?
		// Repetitive , Loop
		// until condition is matching,
		
		// condition match 
		// action performed
		
		// 3 types
		
		// while, first we check condition then action
		// dowhile , first we do action , then condition
		
//		int i = 20;
//		// 20 <= 10   // false
//		while(i <= 10) {
//			System.out.println("Hello i am inside loop for value " + i);
//			i++;
//		}
		
		
//		while(condition) {
//			Action (Body) - logic to run
//		}
		
		
		// do.while
//		int i = 20;
//		do {
//			System.out.println("Hello i am inside loop for value " + i);
//			i++;
//		}while(i <= 10);
		
		// in do while, loop will execute atleast once
		
		// for
		// if continue statement calls. skip
//		then it wont run next step for current iteration
		
		for( int k = 1 ;  k <= 10   ; k++ ) {
			if(k == 6) {
				continue;
			}
			System.out.println("value " + k);
		}
		
		
	}
}
