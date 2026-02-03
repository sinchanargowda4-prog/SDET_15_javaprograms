package javaprograms;

public class palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =131;
		int org_num = num;
		int rev=0;

				while(num!=0) {
					rev = rev*10+num %10;
					num =num%10;

				}
		
		System.out.println(rev);
		if(org_num == rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

}
