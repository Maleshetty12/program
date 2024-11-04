import java.util.*;
class ReverseNumber
{
    public static void main(String arg[])
    {
        //approach 1;
        /* 
        
         int no=123456;
         int rev=0;
         while(no!=0)
         {
            rev=rev*10+no%10;
            no=no/10;

         }
            
         System.out.println("reverse number="+rev);
         */

        /* 
         //approach 2 using String buffer class 
         StringBuffer rev;
          StringBuffer sb=new StringBuffer(String.valueOf(123456));
          rev=sb.reverse();
          System.out.println("reverse number is:"+rev);
          */



          //apporach using StringBuilder class

          StringBuilder rev;
          StringBuilder sb=new StringBuilder();
          sb.append(123456);
          rev=sb.reverse();
          System.out.println("reverse number is:"+rev);


    }
}