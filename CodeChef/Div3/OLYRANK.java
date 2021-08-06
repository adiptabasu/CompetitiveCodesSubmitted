//Link:https://www.codechef.com/AUG21C/problems/OLYRANK

import java.util.Scanner;

public class OLYRANK 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num-->0)
		{
			long sum=0;
			for(int i=0;i<3;i++)
			{
				sum+=sc.nextLong();
			}
			for(int i=0;i<3;i++)
			{
				sum-=sc.nextLong();
			}
			System.out.println(sum>0?"1":"2");
		}
		sc.close();
	}
}