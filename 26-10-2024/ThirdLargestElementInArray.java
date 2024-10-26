
class ThirdLargestElementInArray
{
    public static void main(String arg[])
    {
        int a[]={10,20,30,50,80,620,45,62};
        int max1=a[0];
        int max2=a[1];
        int max3=a[2];
        for(int i=2;i<a.length;i++){
            if(a[i]>max1){
              max3=max2;
              max2=max1;
              max1=a[i];
            }
            else if(a[i]>max2){
                max3=max2;
                max2=a[i];
            }
            else if(a[i]>max3){
                max3=a[i];
            }

        }
        System.out.println("Second largest element in array::"+max3);
    }
}