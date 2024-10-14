import java.util.*;
class Sphere
{
   public static void main(String arr[])
   	 { 
		Scanner sc=new Scanner(System.in);
		final float PI=3.14f;
		float r;
		double volume;
 		System.out.println("Enter RADIUS");
		r=sc.nextFloat();
		volume=(4.0f/3.0f)*PI*r*r*r;
		System.out.println(volume);
	}
}