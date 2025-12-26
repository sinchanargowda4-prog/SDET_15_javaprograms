package stringbufferbuilder;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string to check palindrome");
		Scanner sc = new Scanner(System.in);
		String Input_string = sc.next();
//		String Input_string = "madam";
		String reversed_string = "";
//		for(int i=Input_string.length()-1;i>=0;i--) 
			int i=Input_string.length()-1;
		
		do
		{
			reversed_string = reversed_string+ Input_string.charAt(i);
			i--;
			
			
		}while(i>=0);
//		System.out.println("input string"+Input_string);
//		System.out.println("reverse string"+reversed_string);
		System.out.println((reversed_string.equalsIgnoreCase(Input_string)));
		if(reversed_string.equalsIgnoreCase(Input_string))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
