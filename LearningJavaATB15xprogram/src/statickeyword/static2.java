package statickeyword;

public class static2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticclass2.method(); // only static method or variable can b called without object creation and using class name
		staticclass2 s2 = new staticclass2();
		s2.method2();
		s2.method();  // using object we can call both static variable & method
		
	}

}

class staticclass2{
	int a = 100;
	static int b = 200;
	
	static void method() {
	//	System.out.println("this is static method" + a); non static variable cannot b access
		System.out.println("static variable can b access" +b);
	}
	
	void method2() {
		System.out.println("this is non static method" + a);
		System.out.println("static variable can b accessed" + b);
	}
}
