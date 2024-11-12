class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
        HashSet<Character> result =new HashSet<>();
        for(int i=0;i<data.length();i++){
            char c=data.charAt(i);
            result.add(c);
        }
        if(result.size()==data.length()){
            return true;
        }
        return false;
        
    }
}