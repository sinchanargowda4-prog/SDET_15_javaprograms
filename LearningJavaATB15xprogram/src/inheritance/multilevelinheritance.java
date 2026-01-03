package inheritance;

public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classa ca=new classc();
		ca.naming();
		classb cb = new classc();
		cb.naming();
		cb.namingb();
	//	classc cc = new classa(); //we cannot create object of parent using child class reference

	}

}
