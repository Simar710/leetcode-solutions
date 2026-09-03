class Solution {
public int countSubstrings(String s) {
if (s.length() == 0){
return 0;
}

int low = 0;
int high = 0;
int currlen = 0;

for (int i = 0; i < s.length(); i++){
for (int j = 0; j <= 1; j++){
low = i;
high = i + j;

while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
low--;
high++;
currlen++;
}
}
}

return currlen;
}
}
