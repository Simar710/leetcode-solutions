class Solution {
public int eraseOverlapIntervals(int[][] intervals) {
Arrays.sort(intervals,(x,y) -> Integer.compare(x[1],y[1]));

int prev = 0;
int count = 1;

for(int i = 1; i < intervals.length; i++){
if (intervals[i][0] >= intervals[prev][1]){
count++;
prev = i;
}
}

return intervals.length - count;
}
}
