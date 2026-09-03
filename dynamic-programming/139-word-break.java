class Solution {
public boolean wordBreak(String s, List<String> wordDict) {
HashSet<String> set = new HashSet<>(wordDict);

int n = s.length();
boolean[] detect = new boolean[n+1];
detect[0] = true;
for (int i = 1; i <= detect.length - 1; i++){
for (int j = 0; j < i; j++){
if(detect[j] && set.contains(s.substring(j, i))){
detect[i] = true;
break;
}
}
}

return detect[n];
}
}
