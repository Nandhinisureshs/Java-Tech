import java.util.*;
import java.util.Queue;
public class CL_Queue{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll(); //dequeue operation 1st element dlt
        System.out.println(q);
        q.remove(); // elements illana stop panniru exception varum poll print agum exception varathu
        System.out.println();
        q.poll();
        System.out.println();

        q.offer(1);
        q.offer(2);
        q.offer(3);//add

        System.out.println(q);

        System.out.println(q.peek());

        
    }
}
