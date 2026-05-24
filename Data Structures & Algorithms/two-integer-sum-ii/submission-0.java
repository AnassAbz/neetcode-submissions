class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) return null;
        HashMap<Integer, Integer> mapReminderNdIndex = new HashMap<>();

        for (int i =0; i < numbers.length; i++){
            if (mapReminderNdIndex.containsKey(numbers[i])){
                int a = mapReminderNdIndex.get(numbers[i]);
                return new int[]{a + 1, i + 1};
            }
            mapReminderNdIndex.put(target - numbers[i], i);
        }

        return null;
    }
}
