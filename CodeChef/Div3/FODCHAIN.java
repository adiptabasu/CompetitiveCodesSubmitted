//Link:https://www.codechef.com/START7C/problems/FODCHAIN

import java.util.Scanner;

public class FODCHAIN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		for(int i=0;i<num;i++)
		{
			String data[]=sc.nextLine().split(" ");
			System.out.println(getLowestTropicLevel(Long.parseLong(data[0]), Long.parseLong(data[1]), 0));
		}
		sc.close();
	}
	public static long getLowestTropicLevel(long e,long k,long accumilator)
	{
		long level=0;
		if(e<=0)
			level = accumilator;
		else
		{
			double engLvl=Math.floor((double)e/k);
			level=getLowestTropicLevel((long)engLvl, k, accumilator+1);
		}
		return level;
	}
}