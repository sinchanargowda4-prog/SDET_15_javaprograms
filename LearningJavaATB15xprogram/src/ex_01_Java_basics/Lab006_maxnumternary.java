package ex_01_Java_basics;

public class Lab006_maxnumternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20, b=25, c= 25;
		int larg = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(larg);
	}

}
