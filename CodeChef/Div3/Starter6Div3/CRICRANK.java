//Link:https://www.codechef.com/START6C/problems/CRICRANK

import java.util.Scanner;

public class CRICRANK 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		for(int i=0;i<num;i++)
		{
			String A[]=sc.nextLine().split(" ");
			String B[]=sc.nextLine().split(" ");
			int a,b;
			a=b=0;
			for(int j=0;j<3;j++)
			{
				if(Integer.parseInt(A[j])>Integer.parseInt(B[j]))
				{
					a++;
				}
				else if(Integer.parseInt(A[j])<Integer.parseInt(B[j]))
				{
					b++;
				}
			}
			if(a>b)
			{
				System.out.println("A");
			}
			else
			{
				System.out.println("B");
			}
		}
		if(num<=0)
		{
			System.out.println("B");
		}
		sc.close();
	}
}