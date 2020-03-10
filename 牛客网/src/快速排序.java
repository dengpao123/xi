public class 快速排序 {
    public static void main(String[] args) {
        int []i=new int[10];
//        sorst(i,0,i.length);
        ssor(i,0,i.length);
    }

    private static void ssor(int[] ara, int left, int right) {
        if (left>right||ara==null||ara.length-1<=0){
            return;
        }
        int base=ara[left];
        int le=left;
        int ri=right;
        while (le!=ri){
            while(le<ri&&base>=ara[le]){
                le++;
            }
            while (le<ri&&base<=ara[ri]){
                ri--;
            }
            if (le<ri){
                int temp=ara[le];
                ara[le]=ara[ri];
                ara[ri]=temp;
            }
        }
        ara[left]=ara[le];
        ara[le]=base;
        ssor(ara,left,le-1);
        ssor(ara,ri+1,right);
    }

//    private static void sorst(int[] i, int r, int l) {
//        if (r<l ||i==null||i.length-1<=0){
//            return;
//        }
//        int base=i[l];
//        int l1=l,r1=r;
//        int temp;
//        while (l1!=r1){
//            while (i[r1]>=base&&r1>l1){
//                r1--;
//            }while (i[l1]>=base&&r1>l1){
//                l1++;
//            }
//            if (l1<r1){
//                temp=i[l1];
//                i[l1]=i[r1];
//                i[r1]=temp;
//            }
//        }
//        i[l]=i[l1];
//        i[l1]=base;
//        sorst(i,l1-1,l);
//        sorst(i,r,r1+1);
//    }

}
