public class 搜索树与双向链表 {
    public TreeNode Convert(TreeNode root) {
//        if (root==null){
//            return null;
//        }
//        if (root.left==null&&root.right==null) return root;
//        TreeNode left=Convert(root.left);
//        TreeNode p=left;
//        while(p!=null&&p.right!=null){
//            p=p.right;
//        }
//        if(left!=null){
//            p.right=root;
//            root.left=p;
//        }
//        TreeNode right=Convert(root.right);
//        if(right!=null){
//            root.right=right;
//            right.left=root;
//        }
//        return left!=null?left:root;
//    }
        if(root == null) return null;
        if (root.right == null || root.left == null) return root;
        TreeNode left = Convert(root.left);
        TreeNode p=left;
        while(p!=null&&p.right!=null){
            p=p.right;
        }
        if(left!=null){
            p.right=root;
            root.left=p;
        }
        TreeNode right= Convert(root.right);
        if (right!=null){
            right.left=root;
            root.right=right;
        }
        return left!=null?left:root;
    }
}
