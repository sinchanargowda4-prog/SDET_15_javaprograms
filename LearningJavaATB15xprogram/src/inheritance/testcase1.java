package inheritance;

public class testcase1 extends baseclass{
	void testcase() {
		browserload();
		db2connection();
		closebrowser();
		testcase2();
	}
	void testcase2() {
		System.out.println("this is child class method");
	}

}
