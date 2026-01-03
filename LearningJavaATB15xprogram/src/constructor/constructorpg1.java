package constructor;

public class constructorpg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();
		student s2=new student("Sinchana");

	}
}
	class student{
		String studentname;
		void sleep() {}
		void study() {}
		void eat() {}
	student(){
		System.out.println("i am default constructor");
	}
	student(String name){
		System.out.println("my name is "+ name);
	}
	}


