import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 数字键盘 {
    private static int ssp=0;
    private static int count=0;
    public static void main(String[] args) {
        ListNoode listNoode0=new ListNoode(0);
        ListNoode listNoode1=new ListNoode(1);
        ListNoode listNoode2=new ListNoode(2);
        ListNoode listNoode3=new ListNoode(3);
        ListNoode listNoode4=new ListNoode(4);
        ListNoode listNoode5=new ListNoode(5);
        ListNoode listNoode6=new ListNoode(6);
        ListNoode listNoode7=new ListNoode(7);
        ListNoode listNoode8=new ListNoode(8);
        ListNoode listNoode9=new ListNoode(9);
        listNoode1.nextNode=listNoode4;
        listNoode1.rightNode=listNoode2;
        listNoode2.rightNode=listNoode3;
        listNoode2.nextNode=listNoode5;
        listNoode3.nextNode=listNoode6;
        listNoode4.rightNode=listNoode5;
        listNoode4.nextNode=listNoode7;
        listNoode5.rightNode=listNoode6;
        listNoode5.nextNode=listNoode8;
        listNoode6.nextNode=listNoode9;
        listNoode7.rightNode=listNoode8;
        listNoode8.rightNode=listNoode9;
        listNoode8.nextNode=listNoode0;

            Scanner scanner=new Scanner(System.in);
            int sum=scanner.nextInt();
            int []xxa=new int[sum];
            String[] strings=new String[sum];
            for (int i=0;i<sum;i++){
                strings[i]=scanner.next();
            }
            for (String s:strings){
                char []ss=s.toCharArray();
                int cun=Integer.valueOf(s);
                int firstmax=0;
                int scentmax=0;
                rest(ss,xxa,listNoode1,cun);
            }
            for (int i:xxa){
                System.out.println(i);
            }
        }


    private static void  rest(char[] ss, int[] xxa,ListNoode list,int cun) {
        if (ss.length==1){
              xxa[ssp]=Integer.valueOf(ss[0])-1;
              ssp++;
        }else {
            int first=0;
            int scent=0;
            xxa[ssp]=ppx(first,scent,ss,list,cun);
            ssp++;
        }
    }

    private static int ppx(int first,int scent,char[] ss,  ListNoode list, int cun) {
            return 0;


    }


    private static class ListNoode{
        public int var;
        public ListNoode nextNode;
        public ListNoode rightNode;
        ListNoode(int var){
            this.var=var;
        }

    }
}
