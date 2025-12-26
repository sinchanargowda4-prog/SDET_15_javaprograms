package arrays;

public class arraypgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {91,33,56,89,4,6,122};
		String name[] = {"sinchana","kushvin","ravi", "anitha","shivajee","spandana"};
		System.out.println(numbers.toString());
		System.out.println(numbers[3]);
//		System.out.println(numbers[-1]);
		System.out.println(numbers[5]);
		System.out.println(numbers.length);
		System.out.println(name[3].split("a"));
		//to split into cahr
		for(int n1:numbers) {
			
			System.out.println(n1);
		}
		
for(String n2:name) {
			
			System.out.println(n2);
		}
String s1= "sinchana";
String[] s=s1.split("");
for(String t:s) {
	System.out.println(t);
	
}
	}

}
