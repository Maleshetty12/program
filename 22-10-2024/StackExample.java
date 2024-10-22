import java.util.*;
class StackExample
{
    public static void main(String arg[])
    {
        Stack<String> x=new Stack<>();
        x.push("mahesh");  // add element in the stack
        x.push("aniket");
        x.push("rajkumar");
        x.push("chetake");
        x.push("joshi");
        x.push("amit");
        x.push("ajit");
        System.out.println(x);

        System.out.println(x.pop()); //remove element in the stack
        System.out.println(x);

        System.out.println(x.peek());// it returns the last element in stack
        System.out.println(x);

        System.out.println(x.empty());//it gives true when stack in empty otherwise false
        System.out.println(x);
        x.clear();
        System.out.println(x);


        

    }
}