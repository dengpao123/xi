public class 被3整除 {
    public static void main(String[] args){
        System.out.println(qujian(10,110));
    }
    private static int qujian(int l,int r){
        int x=0;
        int sum=0;
        for(int i=1;i<=r;i++){
            if (i<l){
                sum=sum+i;
            }else {
                sum=sum+i;
                if (sum%3==0){
                    x++;
                }
            }
            sum=sum*10;
        }
        return x;
    }
}
