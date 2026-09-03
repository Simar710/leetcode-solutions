class Solution {
public int evalRPN(String[] tokens) {
Deque<Integer> dq = new ArrayDeque<>();

for(String s: tokens){
if("+".equals(s) || "-".equals(s) || "/".equals(s) || "*".equals(s)){
int b = dq.pop();
int a = dq.pop();

switch(s){
case "+":
dq.push(a+b);
break;

case "-":
dq.push(a-b);
break;

case "*":
dq.push(a*b);
break;

default:
dq.push(a/b);
}
}
else{
dq.push(Integer.parseInt(s));
}
}
return dq.pop();
}
}
