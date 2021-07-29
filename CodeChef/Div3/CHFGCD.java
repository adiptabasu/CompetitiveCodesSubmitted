//Link:https://www.codechef.com/problems/CHFGCD

import java.util.Scanner;

public class CHFGCD 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			long n1=sc.nextLong();
			long n2=sc.nextLong();
			String output="";
			if(getGCD(n1, n2)>1)
			{
				output="0";
			}
			else if((getGCD(n1+1, n2)>1)||(getGCD(n1, n2+1)>1))
			{
				output="1";
			}
			else
			{
				output="2";
			}
			System.out.println(output);
		}
		sc.close();
	}
	public static long getGCD(long x,long y)
	{
		long gcd=1;
		if(x==0)
		{
			gcd=y;
		}
		else
		{
			gcd=getGCD(y%x, x);
		}
		return gcd;
	}
}