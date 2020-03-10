import java.util.ArrayList;

public class 顺时针打印矩阵 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix.length==0){
            return null;
        }
        ArrayList<Integer> arrayList=new ArrayList();
        int wigt=matrix.length;
        int lengt=matrix[0].length;
        printf(matrix,0,0,lengt-1,wigt-1,arrayList);
        return arrayList;
    }

    private void printf(int[][] matrix, int startlen, int startwit, int endlen, int endwit,ArrayList<Integer> arrayList) {
        if(startlen<endlen&&startwit<endwit){
            for(int j=startlen;j<=endlen;j++) arrayList.add(matrix[startwit][j]);
            for(int j=startwit+1;j<=endwit-1;j++) arrayList.add(matrix[j][endlen]);
            for(int j=endlen;j>=startlen;j--) arrayList.add(matrix[endwit][j]);
            for(int j=endwit-1;j>=startwit+1;j--) arrayList.add(matrix[j][startlen]);
            printf(matrix,startlen+1,startwit+1,endlen-1,endwit-1, arrayList);
        }else if(startwit==endwit&&startlen<endlen){
            for (int j=startlen;j<=endlen;j++){
                arrayList.add(matrix[startwit][j]);
            }
        }else if(startlen == endlen&&startwit<endwit){
            for (int j=startwit ;j<=endwit;j++){
                arrayList.add(matrix[j][startlen]);
            }
        }else if( startlen == endlen&& startwit==endwit){
            arrayList.add(matrix[startlen][startlen]);
        }else return;
    }
}
