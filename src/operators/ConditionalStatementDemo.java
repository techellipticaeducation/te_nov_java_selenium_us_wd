package operators;

import java.util.Scanner;

public class ConditionalStatementDemo {
	public static void main(String[] args) {
		// based on age , i would like you to give me age group
		// person age is less then or equal to 18 then give me child
		// more then 18 then give me adult
		// <= 18 = child
		// >18 and <30 = adult
		// >30 and <45 = Mature
		// >45 = old

		// variable scope is depends on blocks

		// boundary validation
		// 0 , 17, 18,19, 29,30,31, 44,45,46 , -10, 60

		// Scanner class

		System.out.println("Age and Age Group Validation");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("-----------");
			System.out.print("Enter Your age: ");
			int age = scan.nextInt();
			System.out.print("Your Expected Group: ");
			String expectedAgeGroup = scan.next();
			String ageGroup = "";

			// First matching condition , then your code will out from if else block
			if(age < 18) {	
				ageGroup = "Child";			
			}else if(age>=18 && age <= 37) { // 35
				ageGroup = "Adult";
			}else if(age>30 && age <= 45) {
				System.out.println("Mature");
			}else {
				System.out.println("Old");
			}
				
			if(expectedAgeGroup.equals(ageGroup)) {
				System.out.println("Test Passed");
			}else {
				System.err.println("Test Failed. Expected - " + expectedAgeGroup + ", Actual - " + ageGroup);
			}
		}
				// 	Basic Java 
	}
}
