import java.util.*;
class ListExample
{
    public static void main(String arg[])
    {
        List<String> x=new ArrayList<>();
        x.add("mahesh");
        x.add("aniket");
        x.add("rajkumar");
        x.add("chetake");
        x.add("joshi");
        x.add("amit");
        x.add("ajit");
        System.out.println(x);
        x.remove(1);
        System.out.println(x);
        for(int i=0;i<x.size();i++)
        {
            System.out.println("name is="+x.get(i));
        }

    }
}