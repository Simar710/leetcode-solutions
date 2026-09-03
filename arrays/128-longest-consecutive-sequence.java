class Solution {
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0){
      return 0;
    }

  HashSet <Integer> set = new HashSet<>();

  for (int i : nums){
    set.add(i);
  }
    int newMax = 0;

  for (int i : set){
    if (!set.contains(i - 1)){
      int k = i;
      int maxi = 1;
      while (set.contains(k + 1)){
        maxi++;
        k++;
      }
      newMax = Math.max(newMax, maxi);
    }
  }

  return newMax;
  }
}
