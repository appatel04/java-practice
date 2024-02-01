public class matrix2 {

    public static void main(String[] args) {
        
        int[][] matrix1 = {{1, 2}, {3, 4}}; // 2x2 matrix
        int[][] matrix2 = {{5, 6}, {7, 8}}; // 2x2 matrix
        
        int[][] product = multiply(matrix1, matrix2);
        
        // display the product matrix
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
    }