class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_set = set()
        max_length = 0
        left = 0
        right = 1

        while left < len(s):
            left_char = s[left]
            char_set.add(left_char)

            if right >= len(s):
                max_length = max_length or 1
                break

            right_char = s[right]
            while right_char not in char_set:
                char_set.add(right_char)

                if right + 1 < len(s):
                    right += 1
                    right_char = s[right]

                this_len = len(char_set)
                if this_len > max_length:
                    max_length = this_len

            char_set.remove(left_char)
            left += 1
            if left >= right:
                right = left + 1

        return max_length


if __name__ == "__main__":
    print(Solution().lengthOfLongestSubstring("dvdf"))
