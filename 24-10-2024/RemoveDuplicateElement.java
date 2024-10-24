import java.util.*;
class RemoveDuplicateElement{
    public static void main(String arg[]){
        int a[]={10,50,60,40,10,30,60,40,65};
        Arrays.sort(a);    //sorted array             //when you remove duplicate element in array then array must sorted
        int temp[]=new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++){
           if( a[i]!=a[i+1]){

           temp[j]=a[i];
            j++;
           }
        }
        temp[j++]=a[a.length-1];           ///////
        for(int i=0;i<j;i++){
           a[i]=temp[i];
        }
        for(int i=0;i<j;i++){
            System.out.print(a[i]+" ");
        }
        

    }

}