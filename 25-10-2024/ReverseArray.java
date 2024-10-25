
class ReverseArray
{
    public static void main(String arg[])
    {
       int a[]={10,20,30,50,80,620,45,62};
       /* 
        System.out.println("display element in array in reverse order");
        for(int i=a.length-1;i>0;i--){
            System.out.println(a[i]);
        }*/


        int b[]=new int[a.length];
        int j=a.length;
        for(int i=0;i<a.length;i++){
            b[j-1]=a[i];
            j=j-1;
        }
        System.out.println("display element in array in reverse order");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);

    }
}

}