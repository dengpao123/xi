public class 无穷素数 {
    private static int sta(int x){
        for (int i=2;i<x;i++){
            if (x%i==0)
                return -1;

        }
        return 1;
    }
    private  static void stas(int i){
        int p=0;
        int count=3;
        int N=2;
        while(p<=i){
            if (sta(count)==1){
                N=N*count;
                p++;
            }
            count++;
        }
        N=N+1;
        if (sta(N)==1) {
            System.out.println(N + "is a prime");
        }else {
            System.out.println(N+"is not a prime");
        }
    }
    public static void main(String[] args) {
        stas(3);
    }
}
