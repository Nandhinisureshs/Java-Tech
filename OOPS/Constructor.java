package OOPS;

    class Car{
    String name;
    int id;
    Car(){// Non-Parameterized Constructor
        System.out.println("Hi...Good Afternoon !!!");
    }
    Car(String brand, int age){ //Parameterized Constructor
       System.out.println("Hi, "+brand+" age is "+age);
    }
    //copy constructor
    Car(int i, String n){
        name = n;
        id = i;
    }
    Car( Car c){
        name = c.name;
        id = c.id;
    }
}


public class Constructor{ 
    public static void main (String[] args) {
       Car c1 = new Car();
       Car c2 = new Car("Avis", 25);
       Car c3  = new Car(3004,"Thar");
       Car c4 = new Car(c3);
       System.out.println("Car c3 : "+c3.name+" "+c3.id);
       System.out.println("Car c4 : "+c4.name+" "+c4.id);
       
    }
}
    

