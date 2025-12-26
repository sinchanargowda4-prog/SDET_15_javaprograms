package stringbufferbuilder;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to reverse a string with pre defined functions
		System.out.println("enter a string to reverse");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringBuilder stringbuilder = new StringBuilder(input);
		System.out.println(stringbuilder.reverse());
		//write a program to reverse a string without using pre defined functions
		String s2 = " ";
		System.out.println("enter a string to reverse");
		Scanner sc1 = new Scanner(System.in);
		String input1 = sc.next();
		//for(int i =0;i<input1.length();i++)
		for(int i = input1.length()-1; i>=0;i--) {
			
		
		 s2+=input1.charAt(i);
			
			
		}
		System.out.println(s2);
		

	}

}
