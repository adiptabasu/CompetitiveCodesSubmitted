//Link:https://www.codechef.com/START6C/problems/ETUP

import java.util.Scanner;

public class ETUP 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			long n=sc.nextLong();
			long q=sc.nextLong();
			long evenCount[]=new long[(int)n+1];
			evenCount[0]=0;
			long prevCount=evenCount[0];
			for(long j=1;j<=n;j++)
			{
				long temp=sc.nextLong();
				if(temp%2==0)
				{
					evenCount[(int) j]=++prevCount;
				}
				else
				{
					evenCount[(int) j]=prevCount;
				}
			}
			for(long j=0;j<q;j++)
			{
				long l=sc.nextLong();
				long r=sc.nextLong();
				long even=evenCount[(int) r]-evenCount[(int) l-1];
				long odd=(r-l+1)-even;
				long EEE=(even*(even-1)*(even-2))/6;
				long EOO=((odd*(odd-1))/2)*even;
				System.out.println(EEE+EOO);
			}
		}
		sc.close();
	}
}
