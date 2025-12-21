package conditions;

import java.util.Scanner;

public class ifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
      System.out.println("enter age");
      int age=scanner.nextInt();
      if(age > 65) {
    	  System.out.println("sernior citizen");
      }else if((age < 65)&&(age > 18)){
    	  System.out.println("adult citizen");
      }else {
    	  System.out.println("minor citizen");
      }
      
	}

}
