//26. Remove Duplicates from Sorted Array
import java.util.Arrays;

public class LeetcodeArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4,74};
         int k = removeDuplicates(nums);
          for(int l =0;l<k;l++){
            System.out.println((nums[l]));
          }
        System.out.println("Unique count: " + k);
    }


     public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;


        int i = 0;//

        for(int j =1; j<nums.length;j++){

            if(nums[j]!=nums[i]){  
                i++;
                 nums[i] = nums[j]; 
            }
        }
        return i+1; 

        
    }
    
}
