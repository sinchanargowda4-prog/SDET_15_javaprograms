package superkeyword;

public class car extends vehicle {
	private int maxspeed = 281;

	private int getMaxspeed() {
		return maxspeed;
	}

	private void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	car(){
		System.out.println("this is child default constr");
	}

	car(int a){
		System.out.println("vehicle car");
	}
	void message() {
		
		System.out.println("this is child message");
	}
	void message(int b) {
		System.out.println("this is param child  message");
	}
}
