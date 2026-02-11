
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;

        if(nums[0] > target) return 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target){
                return i;
            }
            else if (nums[i] > target && nums[i - 1] < target){
                return i;
            }
        }

        return n;
    }
}