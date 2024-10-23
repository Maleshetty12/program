//cpoy element in another array

class ArrayExample
{
    public static void main(String arg[])
    {
        int a[]={10,20,30,50,80,620,45,62};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println("display element in array B");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}