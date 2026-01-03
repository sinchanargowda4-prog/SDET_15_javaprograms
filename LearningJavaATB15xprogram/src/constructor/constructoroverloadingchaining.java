package constructor;

public class constructoroverloadingchaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading load = new overloading();
		new overloading("ritz");
		new overloading("ritz",1995);
		

	}

}
class overloading{
   String name;
    int year;
	overloading(){
	System.out.println("default Constructore overloading");
	}
	overloading(String newname){
		this("thar",1996);
		this.name = newname;
		
		System.out.println(" Constructor 1 overloading" + name);
		
	}
	overloading(String name, int year){
//		this("honda");
		this.year=year;
		System.out.println(" Constructor 2 overloading" + name + year);
		
	}
	
}
