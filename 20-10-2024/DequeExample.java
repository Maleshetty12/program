import java.util.*;
class DequeExample {
    public static void main(String arg[])
    {
        ArrayDeque<Integer> x =new ArrayDeque<>();
        x.offer(10);//add element in Queue           // offer and offerlast are same
        x.offerFirst(20);// addd element in first position
        x.offerLast(50);//add element in last position
        x.offerLast(60);
        x.offer(30);
        x.offerFirst(40);
        x.offer(65);
        System.out.println(x);
        x.poll(); //remove element in deque         //poll and polllast are same
        System.out.println(x);
       
        x.pollFirst();//remove first element in Deque
        System.out.println(x);
        x.pollLast();
        System.out.println(x);
        System.out.println(x.peek()); // return first elemnt in deque
        System.out.println(x.peekFirst()); //return first element
        System.out.println(x.peekLast());//return last element
        
        
      
        
    }

    
}
