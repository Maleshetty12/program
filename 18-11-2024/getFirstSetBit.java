class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        String x = Integer.toBinaryString(n);
        for(int i=x.length()-1;i>=0;i--){
            char c=x.charAt(i);
            if(c=='1'){
                return x.length()-i;
            }
        }
        return 0;
            
    }
}