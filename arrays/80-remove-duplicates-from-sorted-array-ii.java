class Solution {
public int removeDuplicates(int[] nums) {

if (nums.length <= 2) {
return nums.length;
}

int i = 2;
int k = 2;
while (i < nums.length){
if (nums[i] != nums[k-2]){
nums[k++] = nums[i];
}
i++;
}
return k;
}
}
