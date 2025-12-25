package functions;

import java.util.Scanner;

public class functionpgm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		function1();
		int c = function2();
		System.out.println(c);
		function3(100,3);
		String st = function4("sinchana","gowda");
		System.out.println(st);
	}
	
	public static void function1() {
		System.out.println("no return type functions");
	}
	public static int function2() {
		System.out.println("enetr a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return a;
	}
	public static void function3(int a, int b) {
		int c = a +b;
		System.out.println(c);
		
	}

	public static String function4(String firstname, String secondname) {
		
		
		return firstname + secondname;
		
	}
}
