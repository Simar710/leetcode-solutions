class Solution {
public int hIndex(int[] citations) {
Arrays.sort(citations);
int k = 0;
for (int i = citations.length - 1; i >= 0; i--){
if (citations[i] >= citations.length - i){
k = citations.length - i;
}
else{
break;
}
}
return k;
}
}
