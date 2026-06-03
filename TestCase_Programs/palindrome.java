package TestCase_Programs;

import java.util.Scanner;

public class palindrome {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        // Read number
        int a = s.nextInt();

        // Extract digits
        int first = a / 1000;

        int second = (a / 100) % 10;

        int third = (a / 10) % 10;

        int last = a % 10;

        // Check palindrome
        boolean palindrome =
                (first == last) &&
                (second == third);

        // Check even sum
        boolean even =
                ((first + last) % 2 == 0);

        // Final condition
        if (palindrome && even) {

            System.out.println("Safe Unlocked!!!");

        } else {

            System.out.println("Try again!!");

        }
    }
}