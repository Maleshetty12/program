import java.util.*;
//import java.lang.*;
class DeleteElementInArray{
    public static void main(String arg[]){
        int n,delete;
        int a[];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        n=sc.nextInt();
        a= new int[n];
        System.out.println("enter element");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("delete element in array:");
        delete=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           if(delete==a[i]){
            a[i]=a[i+1];
           }
        }
        for(int i=0;i<n-1;i++)
        {
            System.out.print(a[i]+" ");

        }

    }
}