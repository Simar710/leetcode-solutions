class Solution {
public boolean isValid(String s) {
Stack<Character> st = new Stack<>();

char[] ch = s.toCharArray();

for (char c: ch){
if(c == '(' || c == '{' || c == '['){
st.push(c);
}
else{
if(st.isEmpty()){
return false;
}

char i = st.peek();

if (i == '{' && c == '}' || i == '[' && c == ']' || i == '(' && c == ')'){
st.pop();
}
else{
return false;
}
}
}

return st.isEmpty();
}
}
