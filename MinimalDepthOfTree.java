// Given a binary tree, find its minimum depth.
//
// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
//

// bug: attention to definition of leave node

public class MinimalDepthOfTree {
    public int minDepth(TreeNode root){
      if(root == null){
        return 0;
      }

      if(root.left == null && root.right == null){
        return 1;
      }

      int depth = 0;
      if(root.left == null){
        depth = minDepth(root.right) + 1;
      }else if(root.right == null){
        depth = minDepth(root.left) + 1;
      }else{
        depth = Math.min(minDepth(root.left), minDepth(root.right)) + 1;
      }

      return depth;

    }
}
class TreeNode {
    int      val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val = x; }
}