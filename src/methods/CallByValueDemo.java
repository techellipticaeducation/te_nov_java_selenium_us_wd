package methods;

public class CallByValueDemo {
	public static void main(String[] args) {
//		int i = 20;
//		Calc.update(i); // creating copy of  i variable 
//		System.out.println(i);
		
		Calc c1 = new Calc();
		c1.j = 50;
		System.out.println(c1.j);
		c1.update();
		System.out.println(c1.j);
		// when ever we deal with objects - then it goes with call by ref
		
	}
}


class Calc{
	int j = 10;
	
	void update() {
		this.j = 30;
	}

	static void update(int i) {
		i  = 10;
	}

}