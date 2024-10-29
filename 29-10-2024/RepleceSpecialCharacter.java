import java.util.Scanner;

class RepleceSpecialCharacter{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str;
    System.out.println("enter a string:");
    str=sc.nextLine();
    str=str.replaceAll("[^A-Za-z0-9]","");
    System.out.println(str);
}
}