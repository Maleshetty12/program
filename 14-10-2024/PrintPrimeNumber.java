import java.util.Scanner;

class PrintPrimeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no;
        System.out.println("enter a number:");
        no=sc.nextInt();
        int count=0;
        for(int i=1;i<=no;i++){
            if(i%1==0||i%i==0){
                count++;
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}