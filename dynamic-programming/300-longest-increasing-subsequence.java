class Solution {
public int lengthOfLIS(int[] nums) {
List<Integer> tails = new ArrayList<>();

for (int num: nums){
int i = 0;
int len = tails.size();

while (i < len){
int mid = i + (len - i)/2;
if (tails.get(mid) < num){
i = mid + 1;
}
else{
len = mid;
}
}

if (i < tails.size()){
tails.set(i, num);
}
else{
tails.add(num);
}
}
return tails.size();
}

}
