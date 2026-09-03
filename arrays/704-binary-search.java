class Solution {
public int search(int[] nums, int target) {
int l = 0; int h = nums.length;
while (h>l){
int m = l + (h-l)/2;
if (target == nums[m]){
return m;
}
else if (target > nums[m]){
l = m + 1;
}
else
{
h = m;
}
}
return -1;
}
}
