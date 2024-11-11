class Solution {
    public static long product(long arr[]) {
        // your code here
        long result=1;
        long mod=1000000007;
        for(int i=0;i<arr.length;i++){
            result=(result*arr[i])%mod;
        }
        return result;
    }
}
