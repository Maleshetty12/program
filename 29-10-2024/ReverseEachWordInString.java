import java.util.*;

class ReverseEachWordInString{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str;
    System.out.println("enter a string:");
    str=sc.nextLine();


    
    //approach 1
    String words[]=str.split(" ");
    String reversestring="";
    for(String s:words){
        String reverseword="";
        int i;
        for(i=s.length()-1;i>=0;i--){
            reverseword=reverseword+s.charAt(i);
        }
        reversestring=reversestring+reverseword;
        if(i!=0){
        reversestring=reversestring+" ";
        }
    }
    System.out.println("reverse each word in string:"+reversestring);
    




    //approach 2    using string builder class
    /* 
    String words[]=str.split("\\s");
    String reversestring="";
    for(String s:words){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        reversestring=reversestring+sb.toString()
        +" ";
    }
    System.out.println("reverse each word in string:"+reversestring);*/
}
}