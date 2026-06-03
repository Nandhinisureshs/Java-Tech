package TestCase_Programs;
import java.util.*;
public class OnlineGame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int left = 0, right = arr.length-1;
        while(left<right){
            while(arr[left]%2==0){
                left++;
            }
            while(arr[right]%2!=0){
                right--;
            }
            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
    
}
