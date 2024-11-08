class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        indexMap = {}
        maxLength = 0
        left = 0
        for right in range(len(s)):
            if s[right] in indexMap:
                left = max(left, indexMap[s[right]] + 1)
            indexMap[s[right]] = right
            maxLength = max(maxLength, right - left + 1)
        return maxLength