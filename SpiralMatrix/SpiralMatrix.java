// package SpiralMatrix;

public class SpiralMatrix {
    public int[][] generateMatrix(int n) {

        int[][] arr=new int[n][n];
        int count=1;

        int minRow=0;
        int maxRow=n-1;
        int minCol=0;
        int maxCol=n-1;

        while(count<=n*n){
            // mincol fixed (micol --> maxcol)
            for(int c=minCol;c<=maxCol;c++){
                arr[minCol][c]=count;
                count++;
            }
            // maxcol fixed (maxrow+1 --> maxrow)
            for(int r=minRow+1;r<=maxRow;r++){
                arr[r][maxRow]=count;
                count++;
            }
            // maxcol fixed (maxco-1 --> mincol)
            for(int c=maxCol-1;c>=minCol;c--){
                arr[maxRow][c]=count;
                count++;
            }
            // maxrow fixed (maxcol-1 --> maxrow+1)
            for(int r=maxRow-1;r>=minRow+1;r--){
                arr[r][minCol]=count;
                count++;
            }

            minRow++;
            minCol++;
            maxRow--;
            maxCol--;
        }

        return arr;




    }
    public static void main(String[] args) {
        SpiralMatrix sm=new SpiralMatrix();
        int n=3;
        int[][] arr=sm.generateMatrix(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
