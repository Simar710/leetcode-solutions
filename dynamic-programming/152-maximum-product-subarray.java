class Solution {
public int maxProduct(int[] nums) {
int result = Integer.MIN_VALUE;
int currMax = nums[0];
int currMin = nums[0];

for (int n:nums){
result = Math.max(result, n);
}

int temp = 0;

for(int i = 1; i < nums.length; i++){
if(nums[i] == 0){
currMax = 1;
currMin = 1;
continue;
}
temp = currMax;
currMax = Math.max(nums[i], Math.max(currMax*nums[i], currMin*nums[i]));
currMin = Math.min(nums[i], Math.min(temp*nums[i], currMin*nums[i]));
result = Math.max(result, currMax);
}

return result;
}
}
