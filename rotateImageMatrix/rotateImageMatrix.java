

public class rotateImageMatrix {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int k = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = k;
            }
        }

        for (int[] row : matrix) {
            reverse(row);
        }
    }

    public void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int k = arr[start];
            arr[start] = arr[end];
            arr[end] = k;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        rotateImageMatrix rm = new rotateImageMatrix();
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rm.rotate(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
    
