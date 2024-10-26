// this problem also solved by using sorting and print element in third position
import java.util.*;
class ThirdsmallestElementInArray
{
    public static void main(String arg[])
    {
        int a[]={12, 35, 1 ,10, 34 ,11};
        /* 
        int min1=a[0];
        int min2=a[1];
        int min3=a[2];
        for(int i=3;i<a.length;i++){
            if(a[i]<min1){
             min3=min2;
              min2=min1;
              min1=a[i];
            }
            else if(a[i]<min2){
                min3=min2;
                min2=a[i];
            }
            else if(a[i]<min3){
                min3=a[i];
            }
        }
            */
            Arrays.sort(a);

        System.out.println("Second smallest element in array::"+a[2]);
    }
}