import java.util.Scanner;

class GCD{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("enter two number:");
        x=sc.nextInt();
        y=sc.nextInt();
        //approach 1
        /* 
        int gcd=1;
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("GCD is :"+gcd);
        */

        //approach 2

        while(x!=y){//loop exicute until the condition is false
            if(x>y){
                x=x-y;
            }
            else{
                y=y-x;
            }
        }
        System.out.println("GCD is :"+y);


    }
}