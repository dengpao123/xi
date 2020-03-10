public class 字符串归一化 {
    public static void main(String[] args) {
        StringBuffer string=new StringBuffer("dabcab");
        StringBuffer ss=new StringBuffer();
        while(string!=null&&string.length()>0){
            ss.append(string.charAt(0));
            ss.append(delet(string,string.charAt(0)));
        }
        System.out.println(ss);
    }

    private static int delet(StringBuffer string,char c) {
        String s=""+c;
        int count=0;
        int x=string.indexOf(s);
        while (x>=0){
            string.deleteCharAt(x);
            count++;
            x=string.indexOf(s);
        }
        return count;
    }
}
