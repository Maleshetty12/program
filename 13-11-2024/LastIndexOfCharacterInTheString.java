class Solution{
    int LastIndex(String s, char p){
        // code here
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c==p){
                return i;
            }
        }
        return -1;
    }
}
