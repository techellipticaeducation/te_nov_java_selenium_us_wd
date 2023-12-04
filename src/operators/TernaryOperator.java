package operators;

public class TernaryOperator {
	public static void main(String[] args) {
		// substitute of if else
		
		
		// Condition 
		// based on age , you have find our age group
		// age is less then 18 then age group should be child
		// age is more then 18 then age group should be adult
		
		int age = 2;
//		String ageGroup = "";
//		if(age <= 18) {
//			ageGroup = "Child";
//		}else {
//			ageGroup = "Adult";
//		}
//		System.out.println(ageGroup);
		
		String ageGroup = age <= 18 ? "Child" : "Adult"  ;
		System.out.println(ageGroup);
		// Ternary Operator
		
		
		
		
		
		// age <= 18 , age group should be child
		// age >= 18 , age group should be adult
		
		// ?:
		
//		int age = 19;
//		String ageGroup =
//				(age <=18 ? "Child":(age > 18 && age < 30 ? "Adult":"Old")); 
//		System.out.println(ageGroup);
//		
//		if(age <= 18) {
//			ageGroup = "Child";
//		}else if(age > 18 && age < 30) {
//			ageGroup = "Adult";
//		}else {
//			ageGroup = "Old";
//		}
		
		// Basic Java 
		// Object Oriented Java
		
	}
}
