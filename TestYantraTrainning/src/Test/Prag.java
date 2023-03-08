package Test;

import java.util.Arrays;

public class Prag {

	public static void main(String[] args) 
	{
		int val=3;
		int[] nums= {3,2,2,3};
		 int i = 0;
	        for (int j = 0; j < nums.length; j++) {
	            if (nums[j] != val) {
	                int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = 0;
	                i++;
	            }
	        }
	        System.out.println(i);
	        System.out.println(Arrays.toString(nums));
	  
	    
	}

}
