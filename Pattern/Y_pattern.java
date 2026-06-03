package Pattern;


import java.util.Scanner;


public class Y_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){          //for rows
            for(int j=1;j<=n;j++){    
                if((i==j) && i<=((n/2)+1) || (i+j==n+1) && i<=((n/2)+1) || (j==n/2+1) && (i>=(n/2)+1) ){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
            sc.close();
        }
    }