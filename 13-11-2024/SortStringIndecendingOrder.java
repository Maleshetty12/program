class Solution 
{ 
    String ReverseSort(String str) 
    { 
        // code here
        char result[]=str.toCharArray();
        Arrays.sort(result);
        String rev="";
        for(int i=result.length-1;i>=0;i--){
            rev=rev+result[i];
        }
        return rev;
    }
} 