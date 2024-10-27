import java.util.*;

class CountWordsInString{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str;
    System.out.println("enter a string:");
    str=sc.nextLine();
    int count=1;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==' '&&str.charAt(i+1)!=' '){
            count++;
        }
    }
    System.out.println("total words in a string:"+count);
    }
}