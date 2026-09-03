class Solution {
public int[][] floodFill(int[][] image, int sr, int sc, int color) {
int originalcolor = image[sr][sc];

if (color == originalcolor){
return image;
}

dfs(image, sr, sc, color, originalcolor);

return image;
}

private void dfs(int[][] image, int sr, int sc, int color, int originalcolor){
int m = image.length;
int n = image[0].length;

if(sr < 0 || sr >= m || sc < 0 || sc >= n || image[sr][sc] != originalcolor){
return;
}

image[sr][sc] = color;

dfs(image, sr - 1, sc, color, originalcolor);
dfs(image, sr + 1, sc, color, originalcolor);
dfs(image, sr, sc - 1, color, originalcolor);
dfs(image, sr, sc + 1, color, originalcolor);
}
}
