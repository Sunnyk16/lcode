public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {

        int sum =0;

        int n=mat.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j == n-1){
                    sum +=mat[i][j];
                }
            }
        }

        return sum;

        
    }
    public static void main(String[] args) {
        MatrixDiagonalSum obj = new MatrixDiagonalSum();
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(obj.diagonalSum(mat));
    }
    
}
