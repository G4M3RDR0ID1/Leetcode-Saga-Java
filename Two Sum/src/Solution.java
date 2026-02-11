import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] output = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];

            // verifica se o complemento já apareceu antes
            if (map.containsKey(complemento)) {
                return new int[] { map.get(complemento), i };
            }

            // salva o número atual e seu índice
            map.put(nums[i], i);
        }
        return output;
    }
}