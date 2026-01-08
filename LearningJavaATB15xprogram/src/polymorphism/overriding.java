package polymorphism;

public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		browser db = new chrome();
		db.openbrowser();
	}

}

class browser{
	void openbrowser() {
		System.out.println("default browser");
	}
	
}
class chrome extends browser{
	@Override
	void openbrowser() {
		System.out.println("chrome browser");
	}
	 
}
