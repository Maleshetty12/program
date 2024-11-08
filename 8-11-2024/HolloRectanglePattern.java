import java.util.*;
class HolloRectanglePattern
{
    public static void main(String arg[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        n=sc.nextInt();
	m=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
		if(i==1||i==n||j==1||j==m)
		{
			System.out.print("*");
           	 }
		else
		{
		System.out.print(" ");	
		}
		

            }
System.out.println("");
                    

    }
}
}