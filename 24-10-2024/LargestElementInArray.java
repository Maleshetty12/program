
class LargestElementInArray
{
    public static void main(String arg[])
    {
        int a[]={10,20,30,50,80,620,45,62};
        int large=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>large){
              large=a[i];
            }
        }
        System.out.println("largest element in array::"+large);
    }
}