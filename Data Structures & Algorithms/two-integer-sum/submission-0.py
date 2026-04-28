class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        indices = {}

        for i, value in enumerate(nums):
            diff = target - value
            if diff in indices and indices[diff] != i:
                return [indices[diff], i] if i > indices[diff] else [i, indices[diff]]
            else:
                indices[value] = i
        return [] 
        