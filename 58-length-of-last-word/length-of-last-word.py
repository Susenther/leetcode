class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.strip()

        count = 0
        i = len(s) - 1

        while i >= 0 and s[i] != ' ':
            count += 1
            i-=1
        return count