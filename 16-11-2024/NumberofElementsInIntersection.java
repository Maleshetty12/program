class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
    
        // code here
        int count=0;
        HashSet<Integer> x=new HashSet<>();
        for(int i=0;i<a.length;i++){
            x.add(a[i]);
        }
         for(int i=0;i<b.length;i++){
           if(x.add(b[i])==false){
               count++;
           }
        }
        return count;
    

    }
}