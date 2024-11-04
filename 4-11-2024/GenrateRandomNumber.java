import java.util.*;
class GenrateRandomNumber{
    public static void main(String[] args) {
        //approach 1 using random class 
        Random x=new Random();
        int randomno=x.nextInt(10);// means print random number between 0 to 9
        int randomnumber=x.nextInt();//it gives interger as well as decimal
        
        System.out.println(randomno);
        System.out.println(randomnumber);

        //approach 2    using math.random
        System.out.println(Math.random());  //it gives decimal number


        //print ascii value
       char mk= 'a';
       int a=mk;
       System.out.println(a);

    }
}