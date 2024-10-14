import java.lang.*;
import java.util.*;
class Qudratic
{
public static void main(String arrg[])
{
float a,b,c;
double r1,r2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a,b,c:");
a=sc.nextFloat();
b=sc.nextFloat();
c=sc.nextFloat();
r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
System.out.println(r1 );
System.out.println("Roots are:" +r2 );
}
}