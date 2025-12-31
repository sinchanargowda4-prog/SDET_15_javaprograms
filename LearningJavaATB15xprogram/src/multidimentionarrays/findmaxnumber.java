package multidimentionarrays;

public class findmaxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a = {1,87,34,9,24};
       int max =0;
       for(int num:a) {
    	   if(num > max) {
    		   max =num;
    	   }
    	  
       }
       System.out.println(max); 
	}

}
