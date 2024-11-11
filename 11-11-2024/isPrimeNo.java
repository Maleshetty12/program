class Solution {
    public static String isPrime(int n) {
        
                
        // Code here
        if(n==1){
            return "No";
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
           if(n%i==0){
               return "No";
           }
        }
        return "Yes";
    }
}