class PrintTheElementInOddPosition{
    public static void main(String ar[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        System.out.println("original array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }
        System.out.println();
        System.out.println("display element in Odd position in array");
        for(int i=1;i<a.length;i=i+2){
            System.out.print(a[i]+" ");

        }
        
    }
}