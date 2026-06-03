package OOPS;
interface Shape{
    void circle();
    void triangle();
    //method define
    static void square(){ // static method in interface
        System.out.println("This is a square");
    }
}

class Pen implements Shape{
    public void circle(){ // public is must because we are implementing the interface method in the class so we must make it public
        System.out.println("This is a circle");
    }
    public void triangle(){
        System.out.println("This is a triangle");
    }
}
public class interfaces {
    public static void main(String args[]){
        Pen p = new Pen();
        p.circle();
        p.triangle();
        Shape.square(); // calling static method
    }
    
}
