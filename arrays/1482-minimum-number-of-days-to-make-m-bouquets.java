class Solution {
public int minDays(int[] bloomDay, int m, int k) {
long need = (long)m*k;
if (need > bloomDay.length) return -1;
int low = 0;
int high = 0;

for (int i: bloomDay){
low = Math.min(low, i);
high = Math.max(high, i);
}

while(low < high){
int mid = low + (high - low)/2;
if (canMake(bloomDay, m, k, mid)){
high = mid;
}
else{
low = mid + 1;
}
}
return low;
}

private boolean canMake(int[] bloomDay, int m, int k, int mid){
int run = 0;
int bouq = 0;
for (int x: bloomDay){
if (x <= mid){
run++;
if (run == k){
bouq++;
run = 0;
if (bouq >= m){
return true;
}
}
}else{
run = 0;
}
}
return bouq >= m;
}
}
