public class 插入排序 {
    public static void main(String[] args) {
        int []arr=new int[20];
        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=00&&temp<arr[j]){
             arr[j+1]=arr[j];
             j--;
            }
            arr[j+1]=temp;
        }
    }
}
