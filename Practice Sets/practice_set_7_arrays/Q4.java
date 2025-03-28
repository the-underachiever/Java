import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] mat1 = new int[2][3];
        int [][] mat2 = new int[2][3];
        int [][] addition = new int[2][3];

        // taking input in matrix 1
        System.out.println("enter elts in mat1 :");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        // taking input in matrix 2
        System.out.println("enter elts in mat2 :");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // addition of two matrices
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                addition[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // printing addition matrix
        System.out.println("addition matrix :");
        for (int i = 0; i < addition.length; i++) {
            for (int j = 0; j < addition[i].length; j++) {
                System.out.print(addition[i][j]+" ");
            }
            System.out.println();
        }
    }
}
