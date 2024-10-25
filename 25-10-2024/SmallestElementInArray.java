
class SmallestElementInArray
{
    public static void main(String arg[])
    {
        int a[]={10,20,30,50,80,620,45,62};
        int small=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<small){
              small=a[i];
            }
        }
        System.out.println("Smallest element in array::"+small);
    }
}