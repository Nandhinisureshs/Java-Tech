package TestCase_Programs;

import java.util.Scanner;

public class rolecode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean canRead = (n & 1) != 0;
        boolean canWrite = (n & 2) != 0;
        boolean canExecute = (n & 4) != 0;

        System.out.println("Can read : " + canRead);
        System.out.println("Can write : " + canWrite);
        System.out.println("Can execute : " + canExecute);
    }

}
