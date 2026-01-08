package statickeyword;

public class staticchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sharedbrowser s1 = new sharedbrowser();
		System.out.println(s1.notcommon);
		
		System.out.println(sharedbrowser.browser);
		
	}

}

class sharedbrowser{
	static String browser = "chrome";
	String notcommon = "edge";
}
