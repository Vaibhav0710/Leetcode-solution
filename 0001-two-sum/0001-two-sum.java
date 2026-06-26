class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (temp.containsKey(num)) {
                return new int[] { i, temp.get(num) };
            }
            temp.put(nums[i], i);
        }
        return new int[] {};
    }
}