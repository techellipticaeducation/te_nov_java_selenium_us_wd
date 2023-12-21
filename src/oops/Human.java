package oops;

public class Human {
 // Characteristics
	
	String name;
	int age;
	double weight;
	int height;
	static String country;
	
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// behavior
	
	void speak(String content){
		System.out.println(name + " - " + content);
	}
	void happyBirthday() {
		System.out.println("Happy Birthday !"+name);
		age++;
	}
	
}
