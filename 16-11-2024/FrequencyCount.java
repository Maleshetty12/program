class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // do modify in the given array
        int result[]=new int[N];
        for(int i=1;i<=N;i++){
            int count=0;
            int j=0;
            while(j<N){
            if(arr[j]==i){
                count++;
            }
            j++;
         }
         result[i-1]=count;
         
    }
    for(int i=0;i<N;i++){
        arr[i]=result[i];
    }
  }
}
