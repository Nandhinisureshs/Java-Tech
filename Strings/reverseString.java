package Strings;
import java.util.*;
public class reverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // we also use only next = only one wrod we get from user or we use nextLine
        String []words = str.split(" ");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i] + " ");
        }
        sc.close();
    }
    
    
}

