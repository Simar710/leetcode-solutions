class Solution {
public int jump(int[] nums) {
int farthest = 0;
int current = 0;
int jump = 0;

for (int i = 0; i < nums.length - 1; i++){
farthest = Math.max(farthest, nums[i] + i);

if(current == i){
jump++;
current = farthest;

if (current >= nums.length - 1){
break;
}

}
}
return jump;

}
}
