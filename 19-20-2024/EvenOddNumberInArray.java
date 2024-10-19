class EvenOddNumberInArray{
    public static void main(String ag[]){
        int a[]={1,2,3,4,5,6,7,8,9};
         System.out.println("Display all elements in array");
         for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
         }
         System.out.println();
         System.out.println("Display all even elements in array");
         for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.print(a[i]+" ");
            }
            }
            System.out.println();
         System.out.println("Display all odd elements in array");
         for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.print(a[i]+" ");
            }
         }

    }
}