class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for idx, num in enumerate(nums):
            matching = target - num
            if matching in seen:
                return [seen[matching], idx]
            seen[num] = idx
        return []

        