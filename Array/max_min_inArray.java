package Array;

import java.util.Arrays;
import java.util.Scanner;

public class max_min_inArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = 0;
        int max = n - 1;

        // Print alternatively maximum and minimum
        for(int i = 0; i < n; i++) {

            if(i % 2 == 0) {
                System.out.print(arr[max] + " ");
                max--;
            }
            else {
                System.out.print(arr[min] + " ");
                min++;
            } 
        }
 sc.close();
     }

}
