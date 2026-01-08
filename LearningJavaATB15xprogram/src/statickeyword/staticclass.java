package statickeyword;

public class staticclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = sample1.a;
//		System.out.println(a);
		sample1 a = new sample1();
		sample1 b = new sample1();
		
		
		

	}

}

class sample1{
	static int a = 100;
	sample1(){
		System.out.println("i am default constructor");
	}
	static void method() {
		System.out.println("i am static method");
		
	}
	static{
		System.out.println("i am static block");
	}
	{
		System.out.println("i am Instance initialization block");
	}
	
	
}
