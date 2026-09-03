class Solution {
public int maxArea(int[] height) {
int l = 0;
int r = height.length - 1;
int vol = 0;
int area = 0;
while(l < r){
area = (r-l)*Math.min(height[l],height[r]);

if(height[l] < height[r]){
l++;
}
else{
r--;
}
vol = Math.max(area, vol);
}
return vol;
}
}
