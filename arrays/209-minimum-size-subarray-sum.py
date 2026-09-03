from sys import maxsize

class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        res = maxsize
        l, t = 0,0

        for i in range (len(nums)):
            t += nums[i]
            while t >= target:
                res = min(res, i - l + 1)
                t -= nums[l]
                l+=1

        return res if res != maxsize else 0
