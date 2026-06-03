package Array;

import java.util.Scanner;

public class Matrix_mulitple {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr1[][] = new int[m][n];
        int arr2[][] = new int[m][n];
        int sum[][] = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        // Print the 2D array
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    sum[i][j] += arr1[i][k] * arr2[k][j];
                }
}
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(sum[i][j] + " ");
            }
        }
        System.out.println();
        sc.close();
    }

}
