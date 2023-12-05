package oops;

public class Human {
 // Characteristics
	
	String name;
	int age;
	double weight;
	int height;
	static String country;
	
	// behavior
	
	void speak(String content){
		System.out.println(name + " - " + content);
	}
	void happyBirthday() {
		System.out.println("Happy Birthday !"+name);
		age++;
	}
	
}
