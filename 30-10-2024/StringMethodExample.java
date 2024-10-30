import java.util.*;
class StringMethodExample
{
    public static void main(String arg[])
    {
        String str1,str;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        str=sc.next();
        System.out.println(str.substring(3));    //return new string to given index
        System.out.println(str.substring(3,9)); 
        System.out.println(str.replace("o","p")); //replace character 
        System.out.println(str.startsWith("malshetty")); //it gives true or false
        System.out.println(str.endsWith("kode")); //it gives true or false
        System.out.println(str.charAt(3));  //it gives perticular character in given string using index
        System.out.println(str.indexOf("m")); //it gives index of character //starting from 0 index
        System.out.println(str.lastIndexOf("m"));  //it gives index of character //starting from last index
        System.out.println("Enter String");
        str1=sc.next();
        System.out.println(str.equals(str1));// it gives true or false// it is casesensitive
        System.out.println(str.equalsIgnoreCase(str1));// it gives true or false// it is not casesensitive
        System.out.println(str.compareTo(str1));//comapare to String according to ascii code\\it gives difference between ascii code
        
    }
}