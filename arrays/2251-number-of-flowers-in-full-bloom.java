class Solution {
public int[] fullBloomFlowers(int[][] flowers, int[] people) {
int m = flowers.length;
int n = people.length;

int [] start = new int[m];
int [] end = new int[m];

for(int i = 0; i < m; i++){
start[i] = flowers[i][0];
end[i] = flowers[i][1];
}

Arrays.sort(start);
Arrays.sort(end);
int []result = new int[n];
for(int i = 0; i < n; i++){
int point = people[i];
int upper = upperbound(start, point);
int lower = lowerbound(end, point);

result[i] = upper - lower;
}

return result;
}

private int upperbound(int []start, int point){
int l = 0;
int h = start.length;
while (h > l){
int mid = l + (h - l)/2;
if(start[mid] <= point){
l = mid + 1;
}
else{
h = mid;
}
}
return l;
}

private int lowerbound(int []end, int point){
int l = 0;
int h = end.length;
while(h > l){
int mid = l + (h-l)/2;
if(end[mid] < point){
l = mid + 1;
}
else{
h = mid;
}
}
return l;
}
}
