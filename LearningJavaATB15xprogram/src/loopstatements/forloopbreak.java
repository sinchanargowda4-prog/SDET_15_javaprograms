package loopstatements;

public class forloopbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int j=0;j<=12;j++) {
//	System.out.println(j); ---if i add it here then 1st staement will b printed 
	if(j==8) {
		break;
	}
	// first condition will get executed followed by print statement , tahts y it will prit till 7
	System.out.println(j);
	
}
	}

}
