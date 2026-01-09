package wrapperclass;

public class trycatchclass {
	public static void main(String[] args) {
		int c=0;
		int b = 0;
		try {
			b=10/c;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("execute me irrespective of error");
		}
	}

}
