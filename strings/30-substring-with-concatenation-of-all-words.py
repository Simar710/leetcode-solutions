from collections import Counter

class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        if not s or not words:
            return []

        word_length = len(words[0])
        total_word_length = len(words) * word_length
        words_freq = Counter(words)
        result = []

        for i in range(len(s) - total_word_length + 1):
            window = s[i:i + total_word_length]

            count_in_window = Counter(window[j: j + word_length] for j in range(0, total_word_length, word_length))

            if count_in_window == words_freq:
                result.append(i)

        return result
