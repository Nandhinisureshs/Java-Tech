package TestCase_Programs;
import java .util.Scanner;
public class Numberseries{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
    
    for(int i=1;i<n;i++){
       int  odd = (i*i)-1;
        int even = (i*i)-2;
        if(i%2==0){
            System.out.print(even + " ");
        }
        else{
            System.out.print(odd + " ");
        }

    }
}
}
