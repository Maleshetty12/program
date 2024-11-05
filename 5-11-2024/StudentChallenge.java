import java.util.*;
class StudentChallenge   
{         
    public static void main(String arg[])
    {
        long a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter binary number");
        a=sc.nextInt();
        String str =String.valueOf(a);
        System.out.println(str.matches("[01]+"));   //check number in binary or not



        String b;
        System.out.println("enter a hexadecimal number");
        b=sc.next();
        System.out.println(b.matches("[0-9A-F]+")); //check hexadecimal or not


        String c;
        System.out.println("enter date (mm/dd//yyyy) this format");
        c=sc.next();
        System.out.println(b.matches("[][]/[0-1][0-9]/[0-9]{4}")); 






        
        
  
}
}