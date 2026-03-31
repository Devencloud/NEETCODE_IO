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
    class Pair{
        int level;
        TreeNode node;
        public Pair(int level,TreeNode node){
            this.level = level;
            this.node = node;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<Pair> q = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return Collections.emptyList();
        }
        q.offer(new Pair(1,root));
        while(!q.isEmpty()){
            Pair top = q.poll();
            addToAnswer(ans,top.level,top.node);

            if(top.node.left!=null){
                q.offer(new Pair(top.level+1,top.node.left));

            }
            if(top.node.right!=null){
                q.offer(new Pair(top.level+1,top.node.right));
            }
        
    }
    return ans;
}
       private void addToAnswer(List<List<Integer>> ans, int level, TreeNode node){
         if(level>ans.size()){
            ans.add(new ArrayList<>());
         }
         ans.get(level-1).add(node.val);
       }
}
