import java.util.Scanner;
public class 数字翻转 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(revers(n));

    }
    public static String revers(int sum){
        StringBuffer st=new StringBuffer();
        st.append(sum);
        st.reverse();
        String s = st.toString();
        return s;
    }
}
