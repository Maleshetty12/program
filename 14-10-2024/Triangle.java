import java.lang.*;
import java.util.*;
class Triangle
{
public static void main(String arrg[])
{
float l,b,h;
double area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter l,b,h:");
l=sc.nextFloat();
b=sc.nextFloat();
h=sc.nextFloat();
area=0.5*l*b*h;
System.out.println("area is:"+area);
}
}