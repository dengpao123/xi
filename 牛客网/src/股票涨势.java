import java.util.ArrayList;

public class 股票涨势 {
    public static void main(String[] args) {
        int[] x={72,11,78};
        System.out.println(calculateMax(x));
    }
    public static int calculateMax(int[] prices) {
        int onebuy=Integer.MAX_VALUE;
        int onesell=Integer.MIN_VALUE;
        int scentbuy=Integer.MIN_VALUE;
        int scentsell=Integer.MIN_VALUE;

        for (int ss:prices){
            onebuy=Math.min(onebuy,ss);
            onesell=Math.max(onesell,ss-onebuy);
            scentbuy=Math.max(scentbuy,onesell-ss);
            scentsell=Math.max(scentsell,scentbuy+ss);
        }
        return scentsell;
    }//寻找数组里面的2个最大差值
}
