//https://www.codechef.com/problems/DONUTSELL
package practice;

import java.util.Scanner;

public class DONUTSELL 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		while(t-->0)
		{
			int sadCount=0;
			String nm[]=sc.nextLine().split(" ");
			int n=Integer.parseInt(nm[0]);
			int m=Integer.parseInt(nm[1]);
			String junk[]=sc.nextLine().split(" ");
			int a[]=new int[junk.length];
			for(int i=0;i<junk.length;i++)
			{
				a[i]=Integer.parseInt(junk[i]);
			}
			junk=sc.nextLine().split(" ");
			int b[]=new int[junk.length];
			for(int i=0;i<junk.length;i++)
			{
				b[i]=Integer.parseInt(junk[i]);
			}
			for(int bi:b)
			{
				if(a[bi-1]-1<0)
				{
					sadCount++;
				}
				else
				{
					a[bi-1]--;
				}
			}
			System.out.println(sadCount);
		}
		sc.close();
	}
}