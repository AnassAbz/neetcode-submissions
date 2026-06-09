class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> hashIndexReminder = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if (hashIndexReminder.containsKey(target - nums[i])){
                return new int[]{hashIndexReminder.get(target - nums[i]), i};
            }
            hashIndexReminder.put(nums[i], i);
        }
        return null;
    }
}
