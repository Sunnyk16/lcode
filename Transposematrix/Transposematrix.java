public class Transposematrix {
    public int[][] transpose(int[][] matrix) {

        int row =matrix.length;
        int col=matrix[0].length;

        int [][] ans = new int[col][row];

        for(int i=0;i < row;i++){
            for(int j=0;j<col;j++){
                ans[j][i]=matrix[i][j];
            }
        } 
        return ans;
        
    }
    public static void main(String[] args) {
        Transposematrix obj = new Transposematrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = obj.transpose(matrix);

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
