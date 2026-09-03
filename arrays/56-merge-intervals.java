class Solution {
public int[][] merge(int[][] intervals) {
Arrays.sort (intervals, (x,y) -> Integer.compare(x[0],y[0]));

List<int[]> list = new ArrayList<>();

int start = intervals[0][0];
int end = intervals[0][1];

for (int i = 0; i < intervals.length; i++){
int currentStart = intervals[i][0];
int currentEnd = intervals[i][1];

if (currentStart <= end){
end = Math.max(currentEnd, end);
}
else{
list.add(new int[]{start, end});
start = currentStart;
end = currentEnd;
}
}
list.add(new int[]{start, end});
return list.toArray(new int[list.size()][]);
}
}
