package Arrays.Easy;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[]indx = new int[2];
        for(int i =0 ; i<nums.length-1 ; i++){
            for(int j = i+1 ; j<nums.length ; j++){
                if(nums[i]+nums[j]== target){
                    indx[0] = i;
                    indx[1] = j;
                    break;
                }
            }
        }
        return indx;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        int[]res = twoSum(nums , 4);
        System.out.println(Arrays.toString(res));
    }
}
