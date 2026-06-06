import java.util.*;
public class PriorityQueue_{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.add(5);
        pq.add(15);
        pq.add(3);
        System.out.println(pq);

        int num = pq.element();//poll element dlt agum ,value venum nah element ah use panni get pannikalam
        System.out.println(num);

        System.out.println(pq.toString());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());

    }
    
}
