class LeftRotationOfArray{
    public static void main(String arg[]){
        int a[]={1,2,3,4,5};
        System.out.println("original array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");   
        }
        //how many times rotate array
        int n=3;
        for(int i=0;i<n;i++){
            int first=a[0];
            int j;
            for(j=0;j<a.length-1;j++){
                a[j]=a[j+1];

            }
            a[j]=first; //add element in last position
        }
        System.out.println("ratate array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");   
        }
    }
}