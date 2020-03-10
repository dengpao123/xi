import java.util.HashMap;
import java.util.Hashtable;

public class 最小深度 {
    public static void main(String[] args){
        HashMap hashMap=new HashMap();
        Hashtable hashtable=new Hashtable();
    }
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x){
            val =x;
        }
    }
    public int run(TreeNode s){
        int x=0;
        if (s==null){
            return x;
        }
        int dep=run(s.left)+1;
        int dep2=run(s.right)+1;
        if (s.left!=null&&s.right!=null){
            x=Math.min(dep,dep2);
        }else{
            x=Math.max(dep,dep2);
        }
        return x;
    }
}
