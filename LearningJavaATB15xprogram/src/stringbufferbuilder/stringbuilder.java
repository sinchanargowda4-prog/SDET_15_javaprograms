package stringbufferbuilder;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("Sinchana");
		System.out.println(sb);
		StringBuilder s1 = sb.reverse();
		System.out.println(sb);
		System.out.println(sb==s1);
		System.out.println(sb.equals(s1));
		
	}

}
