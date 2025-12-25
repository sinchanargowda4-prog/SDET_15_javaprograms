package functions;

import java.util.Scanner;

public class functionpgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter an number");
		Scanner scanner = new Scanner(System.in);
		
			int a =scanner.nextInt();
			System.out.println("enter an number");
			int b = scanner.nextInt();
		int t = add(a,b);
		System.out.println(t);

	}
	
	public static int add(int a, int b) {
		return a+b;
	}

}
