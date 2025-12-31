package multidimentionarrays;

public class righttriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =3;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print("-");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
