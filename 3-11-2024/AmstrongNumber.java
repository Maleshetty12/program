import java.util.Scanner;

class AmstrongNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no;
        System.out.println("enter a number");
        no=sc.nextInt();
        int orgno=no;
        int sum=0;
        while(no>0){
            int m=no%10;
            int n=m*m*m;
            sum=sum+n;
            no=no/10;
        }
        if(sum==orgno){
            System.out.println("amstrong number");
        }
        else{
            System.out.println("not amstrong number");
        }
    
        
    }
}