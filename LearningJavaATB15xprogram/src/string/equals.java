package string;

public class equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "Hello";
		System.out.println(s1==s2); //true
		System.out.println(s1==s3);  //false
		System.out.println(s3==s2);  //false
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3));  //false
		System.out.println(s3.equals(s2));  //false
		System.out.println(s3.equalsIgnoreCase(s2));  //True
		

		

	}

}
