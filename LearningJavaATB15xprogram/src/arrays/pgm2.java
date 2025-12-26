package arrays;

import java.util.Arrays;

public class pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = {1,2,3,4,56};
		for(int i =0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		int[] n2 = {67,33,-2,9,6,90,84};
		Arrays.sort(n2);
		for(int j =0;j<n2.length;j++) {
			System.out.println(n2[j]);
		}
	}

}
