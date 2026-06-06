import java.util.*;
public class deque {
    public static void main(String[] args) {
        //deque - doubly ended queue
        //Insertion and deletion can be done at both ends
       ArrayDeque<Integer> dq = new ArrayDeque<>() ;
       //all four are same operation all will add at the end
       dq.add(10);
       dq.offer(20);
       //deque methods
       dq.offerLast(30);
       dq.addLast(40);
       
       System.out.println(dq);

       dq.offerFirst(60);
       dq.addFirst(70);
       System.out.println(dq);
       dq.remove();//queue methods
       dq.poll();
       //deque method
       dq.removeFirst();
       dq.removeLast();
       dq.pollFirst();
       dq.pollLast();
       //stack operations
       dq.push(100);
       dq.push(45);

       System.out.println(dq);

       dq.getFirst();
       dq.getLast();
       dq.peekFirst();
    }
}
