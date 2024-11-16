class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> x=new HashSet<>();
        for(int i=0;i<a.length;i++){
            x.add(a[i]);
        }
         for(int i=0;i<b.length;i++){
            x.add(b[i]);
        }
        return x.size();
    }
}