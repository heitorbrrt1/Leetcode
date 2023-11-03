public class Solution {
  public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numIndices.containsKey(complement)) {
                return new int[]{numIndices.get(complement), i};
            }

            numIndices.put(nums[i], i);
        }

        return new int[0];
    }
}
