import java.util.*;
import java.lang.*;
class Arithmatic
{
        public static void main(String arrg[])
{
         float a,b,c;
         Scanner sc=new Scanner(System.in);
   System.out.println("     ***MENU***     ");
System.out.println("1.Addition ");
System.out.println("2.Substraction  ");
System.out.println("3.multiplication         ");
System.out.println("4.Division          ");
int option;
System.out.println("Enter any two number:");
a=sc.nextFloat();
b=sc.nextFloat();
System.out.println("Enter your option:");
option=sc.nextInt();
switch(option)
{
case 1:c=a+b;
System.out.println("additon is:"+c);
break;
case 2:c=a-b;
System.out.println("substraction is:"+c);

break;
case 3:c=a*b;
System.out.println("multiplication is:"+c);

break;
case 4:c=a/b;
System.out.println("division is:"+c);

break;

}


}
}