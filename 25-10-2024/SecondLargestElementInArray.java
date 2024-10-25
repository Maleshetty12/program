import javax.print.DocFlavor.INPUT_STREAM;

class SecondLargestElementInArray
{
    public static void main(String arg[])
    {
        int a[]={12, 35, 1 ,10, 34 ,1};
        int max1 = Integer.MIN_VALUE;   //it can hold smallest possible value in integer
        int max2 = Integer.MIN_VALUE;
        System.out.println(max1);
        System.out.println(max1);
        
        for(int i=0;i<a.length;i++){
            if(a[i]>max1){
              max2=max1;
              max1=a[i];
            }
            else if(a[i]>max2&&a[i]!=max1){
                max2=a[i];
            }
        }
        if(max2!=Integer.MIN_VALUE)
        {
            System.out.println("Second largest element in array::"+max2);
        }
        else 
        {
            System.out.println("Second largest element not found");
        }
        
       
    }
}