import java.util.Scanner;

public class 字符串分隔 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            StringBuffer stb=new StringBuffer();
            stb.append(s);
            char [] c={'0','0','0','0','0','0','0','0',};
            while (stb.length()>0&&!stb.equals("")) {
                if (stb.length() < 8&&stb.length()>0) {
                    stb.append(c,0,8-stb.length());
                    System.out.println(stb.toString());
                    stb.delete(0,8);
                }else {
                    String delete = stb.substring(0,8);
                    stb.delete(0,8);
                    System.out.println(delete);
                }
            }
        }
    }
}
