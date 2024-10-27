import java.util.Scanner;

class CountTotalPunctuation{
    public static void main(String[] args) {
        String str;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='!'||str.charAt(i)==','||str.charAt(i)==';'||str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)=='-'||str.charAt(i)=='/'||str.charAt(i)==':'){
            count++;
            }
        }
        System.out.println("total character in string:"+count);
    }
}