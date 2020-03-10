public class 二叉树的最大深度 {
    public static void main(String[] args){

    }
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x){
            val = x;
        }
    }
    public int va(TreeNode treeNode){
        if (treeNode==null){
            return 0;
        }
        return Math.max(va(treeNode.left),va(treeNode.right))+1;
    }
}
