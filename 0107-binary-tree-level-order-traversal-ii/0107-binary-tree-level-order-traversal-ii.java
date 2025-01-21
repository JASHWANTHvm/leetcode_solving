/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) 
        return ans;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int s = q.size();
            List<Integer> n = new ArrayList<>();
            for(int i=0;i<s;i++)
            {
                TreeNode temp = q.poll();
                n.add(temp.val);
                if(temp.left!=null)
                q.offer(temp.left);
                if(temp.right!=null)
                q.offer(temp.right);
            }
            ans.add(0,n);
        }
        return ans;
    }
}