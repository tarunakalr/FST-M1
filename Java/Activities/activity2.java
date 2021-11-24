package activities;

import java.util.Arrays;

public class activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,77,10,54,-11,10};
		System.out.println("Array is "+ Arrays.toString(arr1));
		int num= 10 ;
		int Sum=30;
		
		System.out.println("Result: " + result(arr1,num, Sum));

	}
	
	 public static boolean result(int[] numbers, int num, int Sum) {
	        int temp_sum = 0;
	        //Loop through array
	        for (int number : numbers) {
	            //If value is 10
	            if (number == num) {
	                //Add them
	                temp_sum += num;
	            }

	            //Sum should not be more than 30
	            if (temp_sum > Sum) {
	                break;
	            }
	        }

	        //Return true if condition satisfies
	        return temp_sum == Sum;
	    }
	}


