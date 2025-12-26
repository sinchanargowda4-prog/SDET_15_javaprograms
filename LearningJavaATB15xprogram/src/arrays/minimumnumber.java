package arrays;

public class minimumnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n2 = {67,33,-2,9,6,90,84};
		int min = n2[0];
		for(int i = 0;i<n2.length;i++) {
			if(n2[i]<min) {
				min =n2[i];
			}
		}
		System.out.println(min);
	}

}
