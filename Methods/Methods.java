package Methods;
import java.util.*;

public class Methods {
    //with return type with parameters
    int add(int a, int b){ // this is parameters & static int kudutha object create panna theva illa
        int c=a+b;
        return c;

    }
//with retrun type without parameters
    boolean isPrime(){
        int number = 6;
        //1 2 3 4 5 6 = factors are 1 2 3 6 (0 remiander )
        int count = 0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println(i);
                count++;
            }

        }
        return count == 2; // if count is 2 then it is prime number otherwise not
    }

//without retrun type with parameters

   void sort(int []array){
    for(int i=0;i<array.length;i++){
        for(int j=i+1;j<array.length;j++){
            if(array[i]>array[j]){
                int temp = array[j];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
   }

   //without retrun type without parameters
   void duplicateMain(){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    Methods d = new Methods();
    int c = d.add(num,76);
    System.out.println("Hello: " + c);
    sc.close();
   } 

    public static void main(String args[]){
        Methods m = new Methods(); // mela int static nu kudukalana object create pannaum
        int result = m.add(5,10); //method call
        System.out.println(result);
        int []nums = {1,6,3,9,2};
        m.sort(nums);
        for(int e : nums){
            System.out.print(e + " ");
            
        }
        m.duplicateMain();
        
        }
    }
    

