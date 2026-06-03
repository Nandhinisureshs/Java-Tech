package OOPS;
class Mobile{ //parent cls
    void communicate(){
        System.out.println("Communication using Mobile");
    }
}
//single inheritance
class Nokia extends Mobile{ //child cls
    void game(){
        System.out.println("Snake game");

    }
}

//multi-level interitance

class Samsung extends Nokia{
    void camera(){
        System.out.println("Camera memories");
    }
}

//Hierirarchial inheritance

class Redmi extends Nokia{
    void music(){
        System.out.println("Music can be played");
    }
}

public abstract class Inheritance {
    public static void main(String[] args) {

        ////single inheritance
        Nokia n = new Nokia();
        n.game();
        n.communicate();

        //multi-level interitance
        Samsung s = new Samsung();
        s.communicate();
        s.camera();
        s.game();

        //Hierirarchial inheritance (samsung and redmi renduku object create pannaum bcoz nokia in parent other both are child so we want to create)
        Redmi r = new Redmi();
        r.communicate();
        r.game();
        r.music();
        
    }

    
}
