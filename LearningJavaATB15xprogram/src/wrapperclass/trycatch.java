package wrapperclass;

public class trycatch {
	public static void main(String[] args) {
		String s1=null;
		try {
		
		s1.trim();
		int a =10/0;
		}catch (NullPointerException | ArithmeticException e) {
			System.out.println("null or arith error");
		}catch(Exception e) {
			System.out.println("end");
		}
		System.out.println("end");
		
	}

}
