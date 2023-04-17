import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size m x n of matrix\nm = ");
        int m = scan.nextInt();
        System.out.print("n = ");
        int n = scan.nextInt();
        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];
        int[][] sum = new int[m][n];
        System.out.print("Enter first matrix\n");
        for(int i = 0; i < m; i++){
            for(int j = 0; j< n; j++){
                matrix1[i][j] = scan.nextInt();
            }
        }

        System.out.print("Enter second matrix\n");
        for(int i = 0; i < m; i++){
            for(int j = 0; j< n; j++){
                matrix2[i][j] = scan.nextInt();
                
            }
        }
        
        System.out.print("Sum of two matrix\n");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.print("\n");
        }


    }
}
