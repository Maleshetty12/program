import java.util.Scanner;

class LargestOfThreeNumberUsingTernary{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three number:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int largest=c>(a>b?a:b)?c:(a>b?a:b);        //(a>b?a:b)if a>b then print a otherwise condition is false then print b
        System.out.println("largest number is:"+largest);

    }

}