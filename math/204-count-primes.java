class Solution {
public int countPrimes(int n) {
boolean isPrime [] = new boolean[n];

for (int i = 2; i < n; i++){
isPrime[i] = true;
}

for (int p = 2; p * p < n; p++){
if (isPrime[p]){
for (int m = p * p; m < n; m += p){
isPrime[m] = false;
}
}
}

int count = 0;
for (int i = 2; i < n; i++){
if(isPrime[i]){
count++;
}
}

return count;
}
}
