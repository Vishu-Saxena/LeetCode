package Arrays.Easy;

public class SearchInsertPos {
    public static int searchInsert(int[] nums, int target) {
        int si = 0;
        int ei = nums.length-1;
        while (si<=ei && ei<nums.length && si>=0) {
            int mid = (si+ei)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                si = mid+1;
                if( si<=ei && nums[si] > target){
                    return si;
                }
            }else{
                ei = mid-1;
                if( ei>=si && nums[ei] < target ){
                    return mid;
                }
            }
        }
        if(nums[0]>target){
            return 0;
        }
        if(nums[nums.length-1] < target){
            return nums.length;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 7));
    }
}
