import java.util.Scanner;

class FibonancciSeries{  //fibbonancci series is number series in which each number is sum of two previous number in series   //fibonancci series start from zero
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no;
        System.out.println("enter a number");
        no=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<no-2;i++){   //n-2 because already two numbers are printed
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}