class Solution {
public int majorityElement(int[] nums) {
int k = 0;
int currentMajority = nums[0];
for (int i = 0; i < nums.length; i++){
if (k == 0){
currentMajority = nums[i];
}
if (currentMajority == nums[i]){
k++;
}
else{
k--;
}
}
return currentMajority;
}
}
