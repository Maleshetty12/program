class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        HashSet<Character> result=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(result.contains(c)){
                return c+"";
            }
            result.add(c);
        }
        return "-1";
    }
} 