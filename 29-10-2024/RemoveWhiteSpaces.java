import java.util.Scanner;

class RemoveWhiteSpaces{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter a string:");
        str=sc.nextLine();
        String str1=str.replaceAll("\\s+","");
        System.out.println(str1);
    }
}