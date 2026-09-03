class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        target_chars = set()
        replaced_chars = dict()

        for index in range(len(s)):
            char = s[index]
            new_char = replaced_chars.get(char)

            if new_char and t[index] != new_char:
                return False

            new_char = t[index]

            if new_char in target_chars and replaced_chars.get(char) != new_char:
                return False

            replaced_chars[char] = new_char
            target_chars.add(new_char)

        return True
