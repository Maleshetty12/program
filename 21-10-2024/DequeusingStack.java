import java.util.*;
class DequeusingStack {
    public static void main(String[] args) {
       ArrayDeque<Integer> x=new ArrayDeque<>();
       x.push(10);
       x.push(52);
       x.push(12);
       x.push(10);
       x.push(23);
       x.push(85);
       System.out.println(x);
       x.poll();
       System.out.println(x);
    }

    
}
