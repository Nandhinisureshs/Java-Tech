package ExceptionHandling;
import java.util.Scanner;
public class try_catch_finally {
    public static void main(String[] args) {
        try{ // we write code which may throw exception in try block
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();  //12.5
            System.out.println(num);
            sc.close();
        }catch(ArithmeticException e){ // we handle the exception in catch block
            System.out.println("Arithmetic Exception handled");
            System.out.println(e);

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception handled");
            System.out.println(e);
        }
        catch(Exception e){ // we can also write multiple catch block
            System.out.println("Exception handled");
            System.out.println(e);
        } finally{ //finally means it will execute whether exception is there or not
            System.out.println("This is finally block");
        }
        System.out.println("End of the program");
        
    }
    
}
    
