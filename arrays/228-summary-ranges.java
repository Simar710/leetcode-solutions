class Solution {
public List<String> summaryRanges(int[] nums) {
List<String> stringStore = new ArrayList<>();

if (nums.length == 0) {
return stringStore;
}

int start = nums[0];

for (int i = 1; i <= nums.length; i++){
if (i == nums.length || nums[i - 1] + 1 != nums[i]){
if (start == nums[i - 1]){
stringStore.add(String.valueOf(start));
}
else{
stringStore.add(start + "->" + nums[i - 1]);
}
if (i < nums.length){
start = nums[i];
}
}
}

return stringStore;
}
}
