package TestCase_Programs;
import java.util.Arrays;
import java.util.Scanner;

public class swap {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];

        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        for(int index = 0; index<a-1; index+=2){
            int temp = arr[index];
            arr[index] = arr[index + 1];
                arr[index + 1] = temp;
        }
        System.out.print(Arrays.toString(arr));

    }

}
