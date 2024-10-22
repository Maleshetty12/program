import java.util.*;
class PriorityqueueExample {
    public static void main(String arg[])
    {
        Queue<Integer> x =new PriorityQueue<>();
        x.add(12);
        x.add(20);
        x.add(50);
        x.add(6);
        x.add(30);
        System.out.println(x.poll());   //it returns smallest value in queue
      
        
        
    }

    
}
