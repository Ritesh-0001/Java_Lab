/* Design a java Program to add two matrix using multi-dimensional arrays, pass two dimensional array as parameter to the method */

package Lab_program;

public class matrix_add {
    public static void main(String args[]){
        int row=2,col=3;
        int matrix1[][] = {{2,6,4},{5,3,8}};
        int matrix2[][] = {{4,8,1},{7,1,2}};
        int result[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Addition of Two Matrices:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(result[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
