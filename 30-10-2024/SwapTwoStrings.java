import java.util.*;
class SwapTwoStrings
{
    public static void main(String arg[])
    {
        String a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any two string");
        a=sc.next();
        b=sc.next();
        System.out.println("before swap:"+a+"  "+b);
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("aftre swap:"+a+"  "+b);



    }

}