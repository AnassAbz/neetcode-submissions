class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nums_nd_index = {}
        for index, n in enumerate(nums):
            if ((target - n) in nums_nd_index):
                return [nums_nd_index[target - n], index]
            else:
                nums_nd_index[n] = index
        return []
        