import java.util.*;

class OccuranceOfCharacter{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter a string:");
        str=sc.nextLine();
        int total=str.length();
        String s;
        System.out.println("enter a character:");
        s=sc.next();
        str=str.replaceAll(s,"");
        int totalafterremove=str.length();
        int t=total-totalafterremove;
        System.out.println("total accourance is"+t);
    }
}