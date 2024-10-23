import java.util.Scanner;

class BinarySearchInArray{
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70,80,90};
        Scanner sc=new Scanner(System.in);
        int key;
        System.out.println("enter a key:");
        key=sc.nextInt();
        boolean status=false;
        int l=0;
        int h=a.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==key){                                                      //approach2:: arrays.binaryseach(a,40);//it gives index
                System.out.println("key is found:");
                status=true;
                break;  //to stop this loop
            }
            else if(a[mid]<key){
                l=mid+1;
            }
            else if(a[mid]>key){
                h=mid-1;
            }
        }
        if(status==false){
            System.out.println("key is not found");
        }
    }
}