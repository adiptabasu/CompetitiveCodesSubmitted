//Link:https://www.codechef.com/problems/XORORED

import java.util.Scanner;

public class XORORED 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			int len=sc.nextInt();
			long dataArr[]=new long[len];
			long maxLen=0,maxVal=0;
			int maxPos=0;
			for(int j=0;j<len;j++)
			{
				dataArr[j]=sc.nextLong();
				if(j==0)
				{
					maxVal=dataArr[j];
					maxLen=Long.toString(dataArr[j],2).length();
				}
				else
				{
					if(maxVal<dataArr[j] && maxLen<=Long.toString(dataArr[j],2).length())
					{
						maxVal=dataArr[j];
						maxLen=Long.toString(dataArr[j],2).length();
						maxPos=j;
					}
				}
			}
			int sum=0;
			for(int j=0;j<len;j++)
			{
				sum=(int) (sum|(dataArr[j]^dataArr[maxPos]));
			}
			System.out.println(maxVal+" "+sum);
		}
		sc.close();
	}
}
