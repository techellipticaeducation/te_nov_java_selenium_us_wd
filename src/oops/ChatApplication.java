package oops;

public class ChatApplication {
	public static void main(String[] args) {
		
		// How to create object of a class
		
		Human h1=new Human("Vaibhav",34);
		h1.country = "India";
		Human h2=new Human("Harisha", 32);
		h2.country = "Pakistan";

		h1.speak("Hi");
		h2.speak("Hello");
		
//		System.out.println(h1.country);	
//		System.out.println(h2.country);
//		
		// class name . varibale
//		System.out.println(Human.country);
		
		// 1000 object of human class
		// name = 1000 per object 1 name variable
		// age = 1000
		// country = 1000
		
		// static - shared variable
		
	//	System.out.println(h2.name);
		
	}
}
