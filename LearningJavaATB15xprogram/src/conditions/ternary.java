package conditions;

public class ternary {
	    public static void main(String[] args) {
	        // Change these values to test different numbers
	        int num1 = 2;
	        int num2 = 9;
	        int num3 = -1;

	        // Logic: 
	        // 1. Check if num1 > num2
	        // 2. If true, compare num1 with num3
	        // 3. If false, compare num2 with num3
	        int greatest = (num1 > num2) 
	                       ? ((num1 > num3) ? num1 : num3) 
	                       : ((num2 > num3) ? num2 : num3);
	        
	        

	        System.out.println("Number 1: " + num1);
	        System.out.println("Number 2: " + num2);
	        System.out.println("Number 3: " + num3);
	        System.out.println("The greatest number is: " + greatest);
	    }
	}


