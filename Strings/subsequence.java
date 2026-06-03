package Strings;

import java.util.Scanner;

public class subsequence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //heloo
        String sub_Seq = sc.nextLine(); //hlo in ordered way 
        
        if(str.length() < sub_Seq.length()){
            System.out.println("0");
        } else {
            int i=0,j=0;
            while(i<str.length()){
                if(str.charAt(i) == sub_Seq.charAt(j)){
                    i++;
                    j++;
                } else {
                    i++;

            }
                if(j == sub_Seq.length()){
                    System.out.println("1");
                    return;
                }
        }
        System.out.println("0");
    }
    sc.close();
}
}

