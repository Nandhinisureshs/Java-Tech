package ExceptionHandling;

class MkceException extends Exception{
    MkceException(){
        super("This is a custom exception");
    }
}
public class throw_throws {
    static boolean validateAge(int age) throws MkceException{ // throws is used to declare an exception
    
        if(age > 20){
            return true;
        }else{
            throw new MkceException();
        }
    }
    
    public static void main(String[] args) throws MkceException {
        try {
            validateAge(12);
        } catch(MkceException e){
            System.out.println(e);
        }

            //throw is used to throw an exception explicitly
            // if(14<18){
            //     throw new MkceException();
            // }
            // System.out.println("End of the program");
    }
}
    
