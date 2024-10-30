import java.util.*;
class SwapCase     //upper to lower and lower to upper
{
    public static void main(String arg[])
    {
        String str,a;
       
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string ");
        str=sc.nextLine();
        a="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c>= 'A'&&c<= 'Z')
            {
                c=(char)(c+32);
            }
            else if(c>='a'&&c<='z')
            {
                c=(char)(c-32);
            }  
            a=a+c;
        }
       
        System.out.println(a);
    }
}