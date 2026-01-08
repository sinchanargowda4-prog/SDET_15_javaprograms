package javaprograms;

public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<=100;i++) {
			if((i%2 ==0) && (i%5==0)) {
				System.out.println("fizzbuzz");
				
			}
			else if(i%3==0) {
				System.out.println("buzz");
			}else if(i%2==0) {
				System.out.println("fizz");
			}
		}
		

	}

}
