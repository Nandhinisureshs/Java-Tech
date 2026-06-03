package OOPS;
abstract class Shapes{
    //abstarct cls with abstract method
    abstract void square(); //what to do
}
abstract class Music {
    abstract void play();
    abstract void stop();
    //abstarct cls with concrete method
    void pause(){//how to do
        System.out.println("This is a pause method");// this is common for both play and pause so we can make it concrete method
    }
}
class MobileVivo extends Music{
    void play(){
        System.out.println("This is a mobile");
    }
    void stop(){
        System.out.println("This is a mobile stop");
    }
}
class Laptop extends Music{
    void play(){
        System.out.println("This is a laptop");
    }
    void stop(){
        System.out.println("This is a laptop stop");
    }
}
public class Abstraction {
    public static void main(String args[]){
        MobileVivo m = new MobileVivo();
        m.play();
        m.stop();
        Laptop l = new Laptop();
        l.play();
        l.stop();
        l.pause();
    }
    
}
