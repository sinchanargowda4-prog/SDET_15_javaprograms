package multidimentionarrays;

import java.util.Scanner;

public class patternLefthandtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter an size for multidimention array");
		int n = scanner.nextInt();
		for(int i=0;i<n;i++) //0;0<n  //1;1<n //2;2<n //3;3<nF -end
			
		{
			for(int j=0;j<=i;j++) //0 {1,1<=0F, //0<=1,1<=1,2<=1F//0<=2;1<=2;2<=2;3<=2F
			{
				System.out.print("*");//*
				                      //**
				                      //***
			}
			System.out.println();
		}

	}

}
