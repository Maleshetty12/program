class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            while(j<arr.length){
                if(arr[i]+arr[j]==target){
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}