package Strings;
import java.util.*;
public class non_repetitive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int []count = new int[26]; //26 characters 0r 128 ascii values
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)-'a']++; // we are using this to count the number of times each character is repeated

        }
        for(int i=0; i<str.length(); i++){ // if we use count.length it give in alphabet order 
            if(count[str.charAt(i)-'a'] == 1){
                System.out.print(str.charAt(i) + " ");
                break;
            }
        }
        sc.close();
        

    }
    
}
