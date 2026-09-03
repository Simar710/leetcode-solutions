class Solution {
public List<String> fizzBuzz(int n) {
String s[] = new String[n];
for (int i = 0; i < n; i ++){
if ((i + 1)%3 == 0 && (i + 1)%5 == 0){
s[i] = "FizzBuzz";
}
else if ((i + 1)%3 == 0){
s[i] = "Fizz";
}
else if ((i + 1)%5 == 0){
s[i] = "Buzz";
}
else{
s[i] = String.valueOf(i+1);
}
}
List as = Arrays.asList(s);

return as;
}
}
