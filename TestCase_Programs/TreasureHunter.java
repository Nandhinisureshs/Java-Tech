package TestCase_Programs;
import java.util.Scanner;
public class TreasureHunter {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int coins = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();

        int benShare = (coins * x) / 100;

        int remaining1 = coins - benShare;

        int BlackShare = (remaining1 *  y) / 100;

        int remaining2 = remaining1 - BlackShare;

        int Pirates = remaining2 / 3;

        System.out.println("Ben share: " + benShare);
        System.out.println("Black share: " + BlackShare);
        System.out.println("Each Pirates share: " + Pirates);

    } 
}
