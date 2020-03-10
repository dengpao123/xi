import java.util.*;

public class 幸运串 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuffer string =new StringBuffer();
        string.append(scanner.nextLine());
        HashSet set=new HashSet();
        for (int i=0;i<string.length();i++){
            if (i==0){
                for (int j=0;j<string.length()-1;j++){
                    set.add(string.subSequence(0,j+1));
                }
            }else {
                for (int j=i;j<=string.length()-1;j++){
                    set.add(string.subSequence(i,j+1));
                }
            }
        }
        ArrayList arrayList=new ArrayList();
        for (Object o:set){
            arrayList.add(o);
        }
        Collections.sort(arrayList);
        for(Object o :arrayList){
            System.out.println(o);
        }

    }
//
//    private static void ssss(Object o, String[] ss, String string) {
//        String s=""+o;
//        String string1=string+"";
//        int first=string1.indexOf(s);
//        int len=string1.length();
//        string1.replaceFirst(s,"");
//        int las=string1.length();
//        int lastlen=len-las+first;
//        ss[lastlen]=s;
//    }
}
