package Collection;

import java.util.LinkedList;

public class LL_list {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
         list.add(20);
          list.add(30);
           list.add(40);
           System.out.println(list);
           list.add(1,5);
           System.out.println(list);
           int size = list.size();
           list.remove(1);
           System.out.println(list);

           LinkedList<String> h = new LinkedList<>();
           h.add("Hello");
           h.add("Hat");


           System.out.println(h);
           h.remove("Hat");
           System.out.println("Hello");
           h.addFirst("Hitler");
           h.addLast("Honey");
           System.out.println(h);
           h.removeFirst();
           System.out.println(h);
           h.removeLast();
           System.out.println(h);
           //contains use panni search pannikalam
    }
    
}
