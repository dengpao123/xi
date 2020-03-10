import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 合唱团 {
    public static void main(String[] args) {

        try {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            int sum=reader.read();
            int[] peoples=new int[sum];
            String[] s = reader.readLine().split(" ");
            for (int i=0;i<sum;i++){
                peoples[i]=Integer.valueOf(s[i]);
            }
            int k=reader.read();
            int d=reader.read();
            int first=0;
            int scent=0;
            if (d>sum){
                for (int pp:peoples){
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
