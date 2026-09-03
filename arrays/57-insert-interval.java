class Solution {
public int[][] insert(int[][] intervals, int[] newInterval) {
List<int []> merger = new ArrayList<>(Arrays.asList(intervals));
merger.add(newInterval);

Collections.sort(merger, (x, y) -> Integer.compare(x[0], y[0]));

List<int []> edit = new ArrayList<>();
int [] prev = merger.get(0);

for (int i = 1; i < merger.size(); i++){
int []interval = merger.get(i);
if(prev[1] >= interval[0]){
prev[1] = Math.max(prev[1], interval[1]);
}
else{
edit.add(prev);
prev = interval;
}
}

edit.add(prev);
return edit.toArray(new int[edit.size()][]);
}
}
