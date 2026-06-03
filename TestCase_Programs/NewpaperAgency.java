package TestCase_Programs;
import java.util.*;


public class NewpaperAgency {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int profit = (a*b) - (a*c) - 100;

        System.out.println(profit);
        sc.close();
    }
}
