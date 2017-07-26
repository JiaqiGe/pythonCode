// Given two binary trees, write a function to check if they are equal or not.
//
// Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
//

public class SameTree{
  public boolean isSameTree(TreeNode p, TreeNode q) {
      if(p == null && q == null){
        return true;
      }

      if(p == null || q == null){
        return false;
      }

      if(p.val != q.val){
        return false;
      }

      //recusive function
      boolean isSame = false;
      if(isSameTree(p.left, q.left) && isSameTree(p.right, q.right)){
        isSame = true;
      }

      return isSame;
    }

    public static void main(String[] args){
      TreeNode p = new TreeNode(0);
      TreeNode q = new TreeNode(0);

      p.left = new TreeNode(1);
      q.right = new TreeNode(1);

      SameTree s = new SameTree();
      System.out.println(s.isSameTree(p,q));
    }
}


class TreeNode {
    int      val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val = x; }
}
