import java.util.Scanner;

class CountEvenOddDigitsInNumber{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int no;
        System.out.println("enter a number:");
        no=sc.nextInt();
        int evencount=0;
        int oddcount=0;
        while(no>0){
            int reminder=no%10;
            if(reminder%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
            no=no/10;
        }
        System.out.println("total even number is:"+evencount);
        System.out.println("total odd number is:"+oddcount);
    }
}