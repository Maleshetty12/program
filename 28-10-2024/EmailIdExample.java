import java.util.*;
class EmailIdExample
{
    public static void main(String arg[])
    {
        String a,b,c;
        int i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter EmailID");
        a=sc.next();
        i=a.indexOf("@");
        b=a.substring(0,i);
        c=a.substring(i+1,a.length());
        System.out.println("UserName:"+b);
        System.out.println("DomainName:"+c);
        System.out.println(c.startsWith("gmail"));
    }
}