class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (intMap.containsKey(complement)) {
                return new int[] { intMap.get(complement), i };
            }

            intMap.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}