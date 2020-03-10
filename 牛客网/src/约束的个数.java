import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 约束的个数 {
    public static void main(String[] args) {
        try {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.valueOf(reader.readLine());
            String[] p=new String[x];
            p=reader.readLine().split(" ");
            for (String xx:p){
                int next=Integer.valueOf(xx);
                System.out.println(yueshu(next));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int yueshu(int next) {
        int count=0;
        int j=1;
        if (next==0){
            return 0;
        }else {
            for (j=1;j<Math.sqrt(next);j++){
                if (next % j == 0) {
                    count+=2;
                }
            }
            if (j*j==next){
                count++;
            }
        }
        return count;
    }
}
