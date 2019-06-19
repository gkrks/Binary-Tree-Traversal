/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> res = new LinkedList<>();
        
        if(root != null){
            res.add(root.val);
            res.addAll(preorderTraversal(root.left));
            res.addAll(preorderTraversal(root.right));
        }
        
          return res;  
            
    }
}
