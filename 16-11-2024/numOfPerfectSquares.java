class Solution {
    static int numOfPerfectSquares(int a, int b) {
        // code here
        int count=0;
        for(int i=a;i<=b;i++){
            int sqrt=(int)Math.sqrt(i);
            if(sqrt*sqrt==i){
                count++;
            }
        }
        return count;
    }
};