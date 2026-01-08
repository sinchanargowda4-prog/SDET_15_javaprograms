package polymorphism;

public class polyoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();
		s1.student();
		s1.student("sinchana");
		s1.student("sinchana", 123);

	}

}

class student{
	void student() {
		System.out.println("default method");
	}
	void student(String name) {
		System.out.println("overloading  method with name" +name);
	}
	void student(String name , int usn) {
		System.out.println("overloading  method with name & urn"+name + usn);
	}
}
