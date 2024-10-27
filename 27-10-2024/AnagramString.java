import java.util.*;

class AnagramString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1,str2;
        System.out.println("enter a string");
        str1=sc.next();
        str2=sc.next();
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();
        if(str1.length()!=str2.length()){
            System.out.println("string are not angram");
        }
        else{
            char a[]=str1.toCharArray();
            char b[]=str1.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b)==true){
                System.out.println("string are angram");
            }
            else{
                System.out.println("string are not angram");
            }
            
        }

    }
}