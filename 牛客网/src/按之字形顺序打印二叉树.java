import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 按之字形顺序打印二叉树 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> x=new ArrayList<ArrayList<Integer>>();
        if(root == null) return x;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        ArrayList<Integer> list;
        queue.add(root);
        int count=1;
        while(!queue.isEmpty()){
            list=new ArrayList();
            int size=queue.size();
            for (int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(count%2==0){
                    list.add(0,node.val);
                }else{
                    list.add(node.val);
                }
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
            count++;
            x.add(list);
        }
        return x;
    }
}
