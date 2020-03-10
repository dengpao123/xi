import java.util.Scanner;
import java.util.Stack;

public class 单词倒排 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        String s2 = s.replaceAll("[^a-zA-Z]", " ");
        String[] strings=s2.split(" ");
        Stack<String> st=new Stack();
        for (String s1:strings){
            st.push(s1);
        }
        int i=0;
        while (!st.isEmpty()){
            strings[i]=st.pop();
            i++;
        }
        String ss="";
        for (int j=0;j<strings.length;j++){
            if (strings[j].isEmpty()||strings[j].equals("\\s")){
            }else {
                ss=ss+strings[j]+" ";
            }
        }
        System.out.println(ss);
    }
}
