public class 对称二叉树{
    boolean isSymmetrical(TreeNode root) {
        if (root == null){
            return true;
        }
        return isturn(root.left,root.right);   
    }

    private boolean isturn(TreeNode left, TreeNode right) {
        if (left==null&&right==null) return true;
        if (left==null||right==null) return false;
        if(left.val==right.val){
            return isturn(left.left,right.right)&&isturn(left.right,right.left);
        }
        return false;
    }
}
