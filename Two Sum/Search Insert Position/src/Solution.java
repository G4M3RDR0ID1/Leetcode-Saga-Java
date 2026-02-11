import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }

            numbers.add(nums[i]);
        }

        numbers.add(target);
        Collections.sort(numbers);

        return numbers.indexOf(target);
    }
}