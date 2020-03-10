import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class 明明的随机数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num =sc.nextInt();
            TreeSet<Integer> tree=new TreeSet();
            for (int i=0;i<num;i++){
                int s=sc.nextInt();
                tree.add(s);
            }
            for (Integer s:tree){
                System.out.println(s);
            }
        }
    }
}
