

/**
 * SecondQuesiton
 */
public class MaxMinArray {

    public static void ArrayMaxMin (int[] nums){
        int min = nums[0];
        int max = nums[0];

        for(int i = 0; i<nums.length; i++){
            if(nums[i]< min){
                min = nums[i];                
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println("The max of the array is " + max + " and the min is " + min); 
    }

    
}