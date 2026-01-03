package constructor;

public class constructorpgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c1=new cat();
		cat c2=new cat("gabbu");
		cat c3 = new cat("pinky");
		//here for both c2 & c3 cat(string name) will be called
		System.out.println(c2.catname);
		System.out.println(c3.catname);
		
	}
	
	
}

class cat{
	String catname;
	cat(){
		System.out.println("i am default cponstructor");
	
	}
	cat(String name){
		
	this.catname=name; 
		System.out.println("cat name"+name);
	}
}
