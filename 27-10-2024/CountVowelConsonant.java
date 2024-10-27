import java.util.*;
class CountVowelConsonant{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1;
        int vowel=0;
        int consonant=0;
        System.out.println("enter a string :");
        str1=sc.nextLine();
        str1=str1.toLowerCase();  //reduce the comparision string convert into lower case
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'){
                vowel++;
            }
            else if(str1.charAt(i)>='a'&&str1.charAt(i)<='z'){
                if(!(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')){
                    consonant++;
            }
            }
        }
        System.out.println("total vowel:"+vowel);
        System.out.println("total consonant:"+consonant);
    }
}