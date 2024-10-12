package Arrays.Easy;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int[] count =new int[nums.length];
        int k=0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != val){
                count[k] = nums[i];
                k++;
            }
        }
        nums = Arrays.copyOf(count, count.length);
        System.out.println(nums[0] + " "+ nums[1]);
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }
}
