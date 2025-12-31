package multidimentionarrays;

public class secondhighestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] numbers = {12,56,34,78,9,1};
       int highest =0;
       int secondhighest=0;
       for(int num:numbers) {
    	   if(num >highest ) {
    		   secondhighest = highest;
    		   System.out.println(secondhighest);
    	       System.out.println(highest);
    	       highest = num;
    		   
    	   }
    	   else if(num >secondhighest && num !=highest ) {
    		   secondhighest = num;
    	   }
    	   
       }
       System.out.println(secondhighest);
       System.out.println(highest);
       
	}

}
