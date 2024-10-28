import java.util.*;
class Palindrome
{
    public static void main(String arg[])
    {
        String str;
        String rev="";
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string");
        str=sc.next();
      
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);

        }
        System.out.println(rev); //reverse string
     

        if(rev.equals(str))   //palindrome or not
        {
            System.out.println("String is palindrome:");
        }
        else
        {
            System.out.println("String is not palindrome:");
        }


    }
}