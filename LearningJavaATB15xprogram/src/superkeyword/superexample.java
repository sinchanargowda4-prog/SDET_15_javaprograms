package superkeyword;

public class superexample {
	public static void main(String[] args) {
		vehicle c1 = new car();
		c1.vehicle();
		c1.message();
		
		
	}

	
}
class vehicle{
	public int maxspeed = 180;
	vehicle(){
		System.out.println("this is parent default constr");
		
	}
	public void vehicle() {
		// TODO Auto-generated method stub
		System.out.println("this is parent default method");
	}
	vehicle(int a){
		System.out.println("param constr");
	}
	void message() {
		System.out.println("this is default message");
	}
	void message(int b) {
		System.out.println("this is param  message");
	}
}
