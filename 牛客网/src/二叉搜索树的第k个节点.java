public class 二叉搜索树的第k个节点 {
    TreeNode KthNode(TreeNode pRoot, int k){
        int index = 0;
        if(pRoot ==null || k<=0){
            return null;
        }
        TreeNode tager=null;
        if(pRoot.left !=null ){
            tager=KthNode (pRoot.left,k);
        }
        if(tager== null){
            index++;
            if(index == k)
                return pRoot;
        }
        if(pRoot==null&&pRoot.right!=null){
            tager=KthNode(pRoot.right,k);
        }
        return tager;
    }

}
