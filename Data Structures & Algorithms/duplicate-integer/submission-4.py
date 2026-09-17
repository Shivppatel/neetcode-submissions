class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        distinct = set(nums)
        return len(distinct) != len(nums) 
         