class Solution {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    int sumg = 0, sumc = 0;

  for (int i = 0; i < gas.length; i++){
    sumg += gas[i];
    sumc += cost[i];
  }

  if (sumg < sumc){
    return -1;
  }
    int fuel = 0;
    int start = 0;
    for (int i = 0; i < gas.length; i++){
      fuel += gas[i] - cost[i];

    if(fuel < 0){
      start = i + 1;
      fuel = 0;
    }
    }
    return start;
  }
}
