class Solution {
 
    int [] arrayForm(int a, int b, int c) {
        // code here
        int array[]=new int[3];
        array[0]=a;
        array[1]=b;
        array[2]=c;
        return array;
       
    }

    String stringForm(int a, int b, int c) {
        // code here
        String p=a+"";
        String q=b+"";
        String r=c+"";
        String result=p+q+r;
        return result+"";
       
    }
}