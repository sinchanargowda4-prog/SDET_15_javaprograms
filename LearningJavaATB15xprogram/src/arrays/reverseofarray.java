package arrays;

import java.util.Scanner;

public class reverseofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of an array");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] num = new int[size];
		for(int i=0;i<num.length;i++) {
			System.out.println("enter number of "+i+"index");
			Scanner scanner1 = new Scanner(System.in);
			num[i] = scanner1.nextInt();			
		}
		for(int h:num) {
			System.out.println(h);
		}
		for(int j=num.length-1;j>=0;j--) {
			System.out.println(num[j]);
			
		}
		
		

	}

}
