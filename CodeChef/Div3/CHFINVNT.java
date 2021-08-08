//Link:https://www.codechef.com/AUG21C/problems/CHFINVNT

import java.util.Scanner;

public class CHFINVNT 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num-->0)
		{
			System.out.println(getNumOfDays(sc.nextLong(), sc.nextLong(), sc.nextLong()));
		}
		sc.close();
	}
	public static long getNumOfDays(long n,long p,long k)
	{
		long output=0;
		long modval=p%k;
		long cycleCount=(long) Math.floor((double)n/k);
		long extraCycleCount=(long) (n-(cycleCount*k));
		long elemCount=cycleCount*modval;
		long modFactor=0;
		if(modval==0)
		{
			modFactor=0;
		}
		else if(modval<extraCycleCount)
		{
			modFactor=modval;
		}
		else
		{
			modFactor=extraCycleCount;
		}
		output=modFactor+elemCount;
		for(long i=modval;i<n;i+=k)
		{
			output++;
			if(p==i)
			{
				break;
			}
		}
		return output;
	}
}