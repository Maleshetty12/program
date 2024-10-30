import java.util.*;
import java.lang.*;
class UpperToLowerAndLowerToUpper{
    public static void main(String[] args) {
        String str1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String:");
        str1=sc.nextLine();
        StringBuffer x=new StringBuffer(str1);
        for(int i=0;i<str1.length();i++){
            if(Character.isLowerCase(str1.charAt(i))){
                x.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
            }
            else if(Character.isUpperCase(str1.charAt(i))){
                x.setCharAt(i,Character.toLowerCase(str1.charAt(i)));
            }
        }
        System.out.println(x);
        

    }
}