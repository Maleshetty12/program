import java.util.*;
class ArrayDequeExample {
    public static void main(String arg[])
    {
        ArrayDeque<Integer> x =new ArrayDeque<>();
        x.offer(10);//add element in Queue
        x.offerFirst(20);
        x.offerLast(50);
        x.offerLast(60);
        x.offer(30);
        x.offerFirst(40);
        System.out.println(x);
     
      
        
    }

    
}
