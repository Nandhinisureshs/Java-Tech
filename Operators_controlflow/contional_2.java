package Operators_controlflow;


public class contional_2  {
    public static void main(String args[]){
        for(int i = 1; i<=10; ){
            if((i&1)==0){
                System.out.println("Hello "+ i);
                i+=3;
            }
            else{
                System.out.println("Java "+i);
                i+=5;
            }
        }
    }
}
