//Link:https://www.codechef.com/START7C/problems/CHSFORMT

import java.util.Scanner;

public class CHSFORMT 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		for(int i=0;i<num;i++)
		{
			String output="";
			String ab[]=sc.nextLine().split(" ");
			int sum=Integer.parseInt(ab[0])+Integer.parseInt(ab[1]);
			if(sum<3)
			{
				output="1";
			}
			else if(sum>=3 && sum<=10)
			{
				output="2";
			}
			else if(sum>=11 && sum<=60)
			{
				output="3";
			}
			else
			{
				output="4";
			}
			System.out.println(output);
		}
		sc.close();
	}
}