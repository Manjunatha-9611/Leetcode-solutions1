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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();
        q.add(root);
        int size = q.size();
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            size--;
            arr.add(curr.val);
            // List<Integer> temp = new ArrayList<>();
            if (curr.left != null) {
                q.add(curr.left);
                // temp.add(curr.left.val);
            }
            if (curr.right != null) {
                q.add(curr.right);
                // temp.add(curr.right.val);
            }
            // else{
            //     continue;
            // }
            // List<Integer> nTemp = new ArrayList<>();
            // list.add(temp);
            if(size == 0){
                list.add(arr);
                size = q.size();
                arr = new ArrayList<>();
            }
        }
        return list;
    }
}