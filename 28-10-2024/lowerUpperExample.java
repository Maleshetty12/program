import java.util.*;
class lowerUpperExample
{
    public static void main(String arg[])
    {
        String a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string in upper case");
        a=sc.next();
        String str=a.toLowerCase();
        System.out.println(str);
        System.out.println("Enter a string in lower case");
        b=sc.next();
        String str1=b.toUpperCase();
        System.out.println(str1);
        System.out.println( a.length());
    }
}