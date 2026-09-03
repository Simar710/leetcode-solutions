class Solution {
public List<List<Integer>> pacificAtlantic(int[][] heights) {
if (heights == null || heights.length == 0){
return new ArrayList<>();
}

int length = heights.length;
int width = heights[0].length;

boolean[][] pacific = new boolean[length][width];
boolean[][] atlantic = new boolean[length][width];

Queue<int[]> pacificQueue = new LinkedList<>();
Queue<int[]> atlanticQueue = new LinkedList<>();

for (int i = 0 ; i < length; i++){
pacificQueue.add(new int[]{i,0});
atlanticQueue.add(new int[]{i,width - 1});
pacific[i][0] = true;
atlantic[i][width - 1] = true;
}

for (int i = 0 ; i < width; i++){
pacificQueue.add(new int[]{0,i});
atlanticQueue.add(new int[]{length - 1,i});
pacific[0][i] = true;
atlantic[length - 1][i] = true;
}

bfs(heights, pacificQueue, pacific);
bfs(heights, atlanticQueue, atlantic);

List<List<Integer>> result = new ArrayList<>();

for(int i = 0; i < length; i++){
for (int j = 0; j < width; j ++){
if(pacific[i][j] && atlantic[i][j]){
result.add(Arrays.asList(i,j));
}
}
}

return result;
}

private void bfs (int[][] heights, Queue<int[]> oceanQueue, boolean[][] ocean){
int length = heights.length;
int width = heights[0].length;
int[][] dirs = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
while (!oceanQueue.isEmpty()){
int[] cell = oceanQueue.poll();
int i = cell[0];
int j = cell[1];

for (int[] h : dirs){
int x = i + h[0];
int y = j + h[1];

if (x >= 0 && x < length && y >= 0 && y < width && !ocean[x][y] && heights[x][y] >= heights[i][j]){
oceanQueue.add(new int[]{x,y});
ocean[x][y] = true;
}
}
}
}
}
