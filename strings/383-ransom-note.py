class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        ransom_map, magazine_map = Counter(ransomNote), Counter(magazine)

        for key, value in ransom_map.items():
            if magazine_map[key] < value:
                return False

        return True
