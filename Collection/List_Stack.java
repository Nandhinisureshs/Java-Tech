package Collection;

import java.util.Stack;

public class List_Stack {
    public static void main(String[] args) {
        Stack<String> mobiles = new Stack<>();


        mobiles.push("Samsung");
        mobiles.push("Apple");
        mobiles.push("Vivo");
        mobiles.push("Oppo");

        System.out.println(mobiles);
        mobiles.pop();
        System.out.println(mobiles);
        System.out.println(mobiles.peek());
        System.out.println(mobiles.search("Samsung"));

        for(String mobile :mobiles){
            System.out.print(mobile+" ");
        }
        for(int i=0;i<mobiles.size();i++){
            System.out.print(mobiles.get(i)+" ");
        }
    }
    
}
