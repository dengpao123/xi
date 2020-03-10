import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 把二叉树打印成多行 {
    ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
        if (root == null ){
            return lists;
        }
        Queue<TreeNode> queue =new LinkedList<TreeNode>();
        queue.add(root);
        ArrayList<Integer> list;
        while(!queue.isEmpty()){
            int size=queue.size();
            list=new ArrayList<Integer>();
            for (int i= 0;i<size;i++){
                TreeNode tree=queue.poll();
                list.add(tree.val);
                if(tree.left!=null){
                    queue.offer(tree.left);
                }
                if(tree.right!=null){
                    queue.offer(tree.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
