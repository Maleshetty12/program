import java.util.*;
class AddElementInArray{
    public static void main(String ag[]){
        int a[]={10,20,30,40,50};
        int temp[]=new int[a.length+1];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter index and number");
        int index=sc.nextInt();
        int no=sc.nextInt();
        for(int i=0;i<index;i++){
            temp[i]=a[i];

        }
        int tem=a[index];
        temp[index]=no;
        temp[index+1]=tem;
        for(int i=index+2;i<a.length;i++){
            temp[i]=a[i];
        }
        System.out.println("display elements:");
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]+" ");
        }


          
    }
}