import java.util.*;
class BubbleSort
{
	private int a[];
	private int n;
	
	public void accept()
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		n = sc.nextInt();
		a = new int[n];
		System.out.println("enter elements");
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
	}
	public void sort()
	{
		int i,j,t;
		for(i=0;i<=n-2;i++)
		{
			for(j=0;j<=n-2-i;j++)
			{
				if(a[j] > a[j+1])
				{
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;				
				}
			}
		
		}
	}
	public void display()
	{
		int i;
		for(int p : a)
		{
			System.out.print(p+"  ");
		}
		System.out.println();
	}
}

class BubbleSortExample
{
	public static void main(String ar[])
	{
		BubbleSort x = new BubbleSort();
		x.accept();
		System.out.println("Display Before Sorted");
		x.display();
		x.sort();
		System.out.println("Display After Sorted");
		x.display();

	}
		
}
	