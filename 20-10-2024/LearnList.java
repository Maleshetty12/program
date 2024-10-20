import java.util.*;
class LearnList {
    public static void main(String arg[])
    {
        List<Integer> x =new ArrayList<>();
        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        x.add(50);
        System.out.println(x);  //print all element in arrat format
        x.remove(1); //remove value for index


        System.out.println(x);
        System.out.println(x.get(2)); //it value of index
        x.set(1,100); //add element in specific index and remove the old element

        System.out.println(x);
        x.add(2,320); //add element in spscific index
        System.out.println(x);
        x.remove(1);//remove element in specific index
        System.out.println(x);




        System.out.println(x.size()); //get the value of size of array
        System.out.println(x.contains(20));// it gives true or false
        System.out.println(x.remove(Integer.valueOf(30))); // remove element in array
        System.out.println(x);
        x.clear(); //clear all element
        System.out.println(x);
        
    }

    
}
