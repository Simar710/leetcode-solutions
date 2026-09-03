/**
* Definition for a binary tree node.
* public class TreeNode {
* int val;
* TreeNode left;
* TreeNode right;
* TreeNode() {}
* TreeNode(int val) { this.val = val; }
* TreeNode(int val, TreeNode left, TreeNode right) {
* this.val = val;
* this.left = left;
* this.right = right;
* }
* }
*/
class Solution {
public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
List<List<Integer>> result = new ArrayList<>();
if(root == null){
return result;
}
boolean leftToRight = true;
Deque<TreeNode> dq = new ArrayDeque<>();
dq.addLast(root);

while(!dq.isEmpty()){
int len = dq.size();
LinkedList<Integer> level = new LinkedList<>();
for(int i = 0; i < len; i++){
TreeNode node = dq.pollFirst();
if(leftToRight){
level.addLast(node.val);
}
else{
level.addFirst(node.val);
}

if (node.left != null){
dq.addLast(node.left);
}
if (node.right != null){
dq.addLast(node.right);
}
}
result.add(level);
leftToRight = !leftToRight;
}

return result;
}
}
