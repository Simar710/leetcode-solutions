class Solution {
public boolean isPalindrome(String s) {
s = s.toLowerCase();

s = s.replaceAll("[^a-zA-Z0-9]","");

char [] st = s.toCharArray();
int len = st.length;

for (int i = 0; i < len/2; i++ ){
if (st[i] != st[len - i - 1]){
return false;
}
}
return true;
}
}
