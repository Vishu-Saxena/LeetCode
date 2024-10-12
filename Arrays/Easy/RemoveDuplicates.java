package Arrays.Easy;

import java.util.Arrays;

// remove duplicates from sorted array

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int[]unique = new int[nums.length];
        unique[0] = nums[0];
        int k =1;
        for(int i = 1; i<nums.length ; i++){
            if(unique[k-1] != nums[i]){
                unique[k] = nums[i];
                k++;
            }
        }
        for(int i = 0 ; i<unique.length; i++){
            nums[i] = unique[i];
        }
        System.out.println(Arrays.toString(nums));
        return k;

    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    
}