package conditions;

import java.util.Scanner;

public class withoutbrk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a age");
		int d= scanner.nextInt();
		switch(d){
		case 001,002,003 ->System.out.println("case1");
		case 004 ->System.out.println("case2");
		case 005 ->System.out.println("case3");
		}

	}

}
