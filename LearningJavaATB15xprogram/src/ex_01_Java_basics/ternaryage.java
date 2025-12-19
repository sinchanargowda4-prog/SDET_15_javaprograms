package ex_01_Java_basics;

public class ternaryage {
	public static void main(String[] args) {
		int age = 30;
		String classification = (age > 18)?((age > 45)?"senior":"adult"):(age < 45)? "minor" : "adult";
		System.out.println(classification);
		
	}

}
