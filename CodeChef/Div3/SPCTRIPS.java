//Link:https://www.codechef.com/AUG21C/problems/SPCTRIPS

import java.util.Scanner;

public class SPCTRIPS 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num-->0)
		{
			System.out.println(getCount(sc.nextLong()));
		}
		sc.close();
	}
	public static long getCount(long n)
	{
		long count=0;
		for(long c=1;c<=n;c++)
		{
			for(long b=c;b<=n;b+=c)
			{
				if(b%c==0)
				{
					for(long a=c;a<=n;a+=b)
					{
						if(a%b==c)
						{
							count++;
						}
					}
				}
			}
		}
		return count;
	}
}