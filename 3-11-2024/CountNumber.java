import java.util.Scanner;

class CountNumber{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int no;
        System.out.println("enter a number:");
        no=sc.nextInt();
        //approach 1
        /* 
        int count=0;
        while(no>0){
            no=no/10;
            count++;
        }
        System.out.println("total count:"+count);
        */



        //approach 2
        String x=Integer.toString(no);
        int count=0;
        count=x.length();
        System.out.println("total count:"+count);

        no=no/10;
        System.out.println("total count:"+no);
        no=no%10;
        System.out.println("total count:"+no);


    }
}