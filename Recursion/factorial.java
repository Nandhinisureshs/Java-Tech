package Recursion;
import java.util.*;
public class factorial {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fact = 1; // this is the formula to calculate factorial using recursion
    int fact(int n){
        if(n == 0 || n == 1) return 1;
         return n*fact(n-1);
    }
    public static void main(String args[]){
        factorial f = new factorial();
        System.out.println(f.fact(f.n));
    }
}
