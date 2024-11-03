import java.util.Scanner;

class CheckPerfectSquareOrNot{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter a number:");
        num=sc.nextInt();
        boolean status=false;
        for(int i=1;i*i<=num;i++){
            if(num%i==0 && num/i==i){
                status=true;
                System.out.println("perfect square");
            } 
        }
        if(status==false) {
            System.out.println(" not perfect square");
        }
    }
}