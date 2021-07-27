//https://codeforces.com/contest/1551/problem/A

import java.util.Scanner;
 
public class PolycarpAndCoins734A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		for(int i=0;i<num;i++)
		{
			System.out.println(getCount(Long.parseLong(sc.nextLine())));
		}
		sc.close();
	}
	public static String getCount(long denomination)
	{
		String output="";
		long one=denomination/3;
		long two=denomination-one;
		if(!(two%2==0))
		{
			two--;
			one++;
		}
		two/=2;
		output=one+" "+two;
		return output;
	}
}