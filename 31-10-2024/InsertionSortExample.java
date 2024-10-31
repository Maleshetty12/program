import java.util.*;
class InsertionSort
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
		int i,j,t,k;
		for(i=0;i<=n-2;i++)
		{
			for(j=i+1;j<=n-1;j++)
			{
				if(a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					for(k=j;k>i;k--)
					{
						a[k] = a[k-1];
					}
					a[k+1] = t;				
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

class InsertionSortExample
{
	public static void main(String ar[])
	{
		InsertionSort x = new InsertionSort();
		x.accept();
		System.out.println("Display Before Sorted");
		x.display();
		x.sort();
		System.out.println("Display After Sorted");
		x.display();

	}
		
}
	