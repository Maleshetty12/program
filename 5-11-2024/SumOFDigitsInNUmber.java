import java.util.Scanner;

class SumOFDigitsInNUmber{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int no;
        System.out.println("enter a number:");
        no=sc.nextInt();
        int sum=0;
        while(no>0){
            sum=sum+no%10;
            no=no/10;
        }
        System.out.println("sum of digits is:"+sum);
    }
}