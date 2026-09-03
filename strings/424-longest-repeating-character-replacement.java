class Solution {
public int characterReplacement(String s, int k) {
int maxi = Integer.MIN_VALUE;
int countChar = Integer.MIN_VALUE;
int start = 0;
int arr [] = new int[26];

for (int end = 0; end < s.length(); end++){
arr[s.charAt(end) - 'A']++;
countChar = Math.max(countChar, arr[s.charAt(end) - 'A']);

if(end - start + 1 - countChar > k){
arr[s.charAt(start) - 'A']--;
start++;
}

maxi = Math.max(maxi, end - start +1);
}

return maxi;
}
}
