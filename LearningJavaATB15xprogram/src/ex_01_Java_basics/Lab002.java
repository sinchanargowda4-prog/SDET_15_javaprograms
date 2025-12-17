package ex_01_Java_basics;

public class Lab002 {
//	when we have 2 main methods 
//	JVM will look for 1st main method and execute it without any error

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is 2nd main method");
		main("hello");

	}
	public static void main(String args) {
		// TODO Auto-generated method stub
		System.out.println("this is main method");

	}



}
