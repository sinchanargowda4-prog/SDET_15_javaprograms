package conditions;

import java.util.Scanner;

public class switchstatements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the day");
		if(scanner.hasNextInt()) {
			int day = scanner.nextInt();
			switch(day) {
			case 1:
				System.out.println("monday");
				break;
			case 2:
				System.out.println("tuesday");
				break;
			case 3:
				System.out.println("wednesady");
				break;
				
			}
		}
		
		
	}

}
