import java.util.Scanner;

class LargestOfFourNumber{
    public static void main(String[] args) {
         int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter four number:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if(a>b&&a>c&&a>d){
            System.out.println(a);
        }
        else if (b>c&&b>d) {
            System.out.println(b);
        }
        else if(c>d){
            System.out.println(c);
        }
        else{
            System.out.println(d);
        }
    }
}