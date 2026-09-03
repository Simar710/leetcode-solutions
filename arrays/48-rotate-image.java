class Solution {
public void rotate(int[][] matrix) {

int temp = 0;
for (int i = 0; i < matrix.length; i++){
for (int j = i; j < matrix[0].length; j++){
temp = matrix[i][j];
matrix[i][j] = matrix[j][i];
matrix[j][i] = temp;
}
}

for (int i = 0; i < matrix.length; i++){
int left = 0;
int right = matrix.length -1;
while (right > left){
temp = matrix[i][right];
matrix[i][right] = matrix[i][left];
matrix[i][left] = temp;
left++;
right--;
}
}
}
}
