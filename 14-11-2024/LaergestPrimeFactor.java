class Solution {
    static long largestPrimeFactor(int N) {
        long largestFactor = -1;

        // Step 1: Divide N by 2 to remove all factors of 2
        while (N % 2 == 0) {
            largestFactor = 2;
            N /= 2;
        }

        // Step 2: Check for odd factors from 3 onwards
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            while (N % i == 0) {
                largestFactor = i;
                N /= i;
            }
        }

        // Step 3: If N is a prime number greater than 2, it is the largest prime factor
        if (N > 2) {
            largestFactor = N;
        }

        return largestFactor;
    }
}
