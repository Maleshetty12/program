import java.util.*;
class LearnLinkedhashset {
    public static void main(String arg[])
    {
        Set<Integer> x =new LinkedHashSet<>();
        x.add(12);//add element sequential manner
        x.add(20);
        x.add(20);//duplicate element not allow ....store only one
        x.add(20);//
        x.add(20);//
        x.add(50);
        x.add(6);
        x.add(30);
        System.out.println(x);
        x.remove(20); //remove specific element
        System.out.println(x);
        System.out.println(x.contains(20));
    

       
        
        
    }

    
}