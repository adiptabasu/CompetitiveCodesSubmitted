//Link:https://www.codechef.com/AUG21C/problems/PROBDIFF

import java.util.HashMap;
import java.util.Scanner;

public class PROBDIFF 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num-->0)
		{
			HashMap<Integer, Integer> numHist=new HashMap<Integer, Integer>();
			int max=0;
			for(int i=0;i<4;i++)
			{
				int temp=sc.nextInt();
				int currCount=numHist.getOrDefault(temp, 0)+1;
				numHist.put(temp, currCount);
				if(max<currCount)
				{
					max=currCount;
				}
			}
			int out=2;
			if(max==4)
			{
				out=0;
			}
			else if(max==3)
			{
				out=1;
			}
			else
			{
				max=2;
			}
			System.out.println(out);
		}
		sc.close();
	}

}
