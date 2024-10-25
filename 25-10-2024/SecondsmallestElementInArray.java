
class SecondsmallestElementInArray
{
    public static void main(String arg[])
    {
        int a[]={10,20,30,50,80,620,45,62};
        int min1=a[0];
        int min2=a[1];
        for(int i=2;i<a.length;i++){
            if(a[i]<min1){
              min2=min1;
              min1=a[i];
            }
            else if(a[i]<min2){
                min2=a[i];
            }
        }
        System.out.println("Second smallest element in array::"+min2);
    }
}