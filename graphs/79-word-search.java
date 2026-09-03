class Solution {
public boolean exist(char[][] board, String word) {
int m = board.length;
int n = board[0].length;

for (int i = 0; i < m; i++){
for (int j = 0; j < n; j++){
if (dfs(board, word, 0, i, j)){
return true;
}
}
}
return false;
}

private boolean dfs(char[][] board, String word, int idx, int i, int j){
int m = board.length;
int n = board[0].length;

if (idx == word.length()){
return true;
}

if(i < 0 || i >=m || j < 0 || j >= n || board[i][j] != word.charAt(idx)){
return false;
}

char saved = board[i][j];
board[i][j] = '#';

boolean found =
dfs(board, word, idx + 1, i - 1, j) ||
dfs(board, word, idx + 1, i + 1, j) ||
dfs(board, word, idx + 1, i, j - 1) ||
dfs(board, word, idx + 1, i, j + 1);

board[i][j] = saved;
return found;
}
}
