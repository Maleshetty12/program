import java.util.*;
class LearnQueue {
    public static void main(String arg[])
    {
        Queue<Integer> x =new LinkedList<>();
        x.offer(10);//add element in Queue
        x.offer(20);
        x.offer(50);
        x.offer(60);
        x.offer(30);
        x.offer(40);
                                                     //queue:first in first out
        System.out.println(x);
        x.poll(); //remove the first elemnt in the queue
        System.out.println(x);
        x.add(10); //add elemnt in Queue
        System.out.println(x);
        x.remove();//remove the first element in qqueue
        System.out.println(x);
       System.out.println( x.element()); //it return the first element in queue . if queue is empty it thrrow exception
       System.out.println(x.peek());////it return the first element in queue . if queue is empty it gives null
        //x.removeAll(x); //remove all element in queue
        x.clear(); //remove all element
        System.out.println(x);
      
        
    }

    
}
