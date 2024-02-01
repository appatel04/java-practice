import java.util.Scanner;

public class matrix4 {

    public static void main(String[] args) {
        
        int[][] matrix = new int[3][3]; // create a 3x3 matrix
        
        Scanner scanner = new Scanner(System.in); // create a scanner to read user input
        
        // loop through each row and column of the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                // ask the user to input a value for this element of the matrix
                System.out.printf("Enter a value for matrix element (%d,%d): ", i+1, j+1);
                int value = scanner.nextInt();
                
                // assign the value to the matrix element
                matrix[i][j] = value;
            }
        }
        
        // print the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        
        scanner.close(); // close the scanner
    }

}