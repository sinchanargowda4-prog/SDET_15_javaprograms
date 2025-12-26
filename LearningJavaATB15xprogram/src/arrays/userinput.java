package arrays;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.println(num.length);
		for(int i =0;i<num.length;i++) {
			System.out.println("enter number of " +i+"th index");
			Scanner sc1 = new Scanner(System.in);
			num[i] = (int) sc1.nextInt();
		}
		for(int n:num) {
			System.out.println(n);
		}
		
		
		

	}

}
