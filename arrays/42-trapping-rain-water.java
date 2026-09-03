class Solution {
public int trap(int[] height) {
int l = 0;
int r = height.length - 1;
int lmax = 0;
int rmax = 0;
int water = 0;
while(l < r){
if (height[l]<=height[r]){
if (lmax > height[l]){
water += lmax - height[l];
}
else{
lmax = height[l];
}
l++;
}
else{

if (rmax > height[r]){
water += rmax - height[r];
}
else{
rmax = height[r];
}
r--;
}

}
return water;
}
}
