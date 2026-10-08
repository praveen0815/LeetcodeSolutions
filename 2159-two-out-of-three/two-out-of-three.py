class Solution(object):
    def twoOutOfThree(self, nums1, nums2, nums3):
        res = []

        values = set(nums1) | set(nums2) | set(nums3)

        for i in values:
            count = 0

            if i in nums1:
                count += 1

            if i in nums2:
                count += 1

            if i in nums3:
                count += 1

            if count >= 2:
                res.append(i)

        return sorted(res)