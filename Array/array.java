// package Array;

// import java.util.*;
// public class array {
//     //getting input from user 
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int [n];

//        for(int i=0;i<n;i++){
//         arr[i] = sc.nextInt();
//        }
       
//         System.out.println(arr[3]);
//     }
    
// }

package Array;

import java.util.*;
public class array {
    //getting input from user 
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int [n];


       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
       }

       //getting the index of the element to be printed
       int index = sc.nextInt();

       Arrays.sort(arr); //sort the array in ascending order
        System.out.print(arr[index]);
    
        sc.close();
       }
    }
