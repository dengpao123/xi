public class 序列化二叉树 {
    String Serialize(TreeNode root) {
        if (root == null ){
            return "";
        }
        StringBuffer sb=new StringBuffer();
        Seris(sb,root);
        return sb.toString();
    }

     void Seris(StringBuffer sb, TreeNode root) {
        if (root == null){
            sb.append("#,");
            return;
        }
        sb.append(root.val);
        sb.append(',');
        Seris(sb,root.left);
        Seris(sb,root.right);
    }
    int i=-1;
    TreeNode Deserialize(String str) {
        if(str.length()==0){
            return null;
        }
        String [] strings=str.split(",");
        return IsString(strings);
    }

    TreeNode IsString(String[] strings) {
        i++;
        if(!strings[i].equals("#")){
            TreeNode treeNode=new TreeNode(0);
            treeNode.val=Integer.parseInt(strings[i]);
            treeNode.left=IsString(strings);
            treeNode.right=IsString(strings);
            return treeNode;
        }

        return null;
    }
}
