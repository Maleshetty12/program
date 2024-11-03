import java.util.*;
class FindSquareRootOfNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter a number:");
        num=sc.nextInt();
        double t;  
        double sqrtroot=num/2;  
       do   
       {  
        t=sqrtroot;  
        sqrtroot=(t+(num/t))/2;  
        }   
        while((t-sqrtroot)!= 0);  
        System.out.println(sqrtroot);
    }
}