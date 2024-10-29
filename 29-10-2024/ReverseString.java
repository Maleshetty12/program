import java.util.*;

class ReverseString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter a string:");
        str=sc.nextLine();
        String rev="";
        //approach 1   using algorithm
        /* 
         for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
         }*/





         /* 
         //approach2 using charArray
          char a[]=str.toCharArray();
          for(int i=str.length()-1;i>=0;i--){
            rev=rev+a[i];
         }*/



         
         //approach 3           using stringBuffer class
            StringBuffer sb=new StringBuffer(str);
              rev=sb.reverse().toString();
              //rev=rev.toString();
          
         System.out.print("reverse a string:"+rev);
    }
}