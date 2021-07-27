//Link:https://www.codechef.com/START6C/problems/JOKRBTMN

import java.util.HashMap;
import java.util.Scanner;

public class JOKRBTMN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		for(int i=0;i<num;i++)
		{
			int n=sc.nextInt();
			if(n<=0)
			{
				//this is just so that there are no unused variables
			}
			int m=sc.nextInt();
			int l=sc.nextInt();
			HashMap<Integer, Integer> colMap=new HashMap<Integer, Integer>();
			for(int j=0;j<m;j++)
			{
				int sizeOfList=sc.nextInt();
				int listInputs=sizeOfList;
				for(int k=0;k<listInputs;k++)
				{
					colMap.put(sc.nextInt(), j);
				}
			}
			int colList[]=new int[l];
			for(int j=0;j<l;j++)
			{
				colList[j]=sc.nextInt();
			}
			int prevElement=colMap.get(colList[0]);
			int segCount=1;
			for(int j=1;j<l;j++)
			{
				int currElement=colMap.get(colList[j]);
				if(prevElement!=currElement)
				{
					segCount++;
					prevElement=currElement;
				}
			}
			System.out.println(segCount);
		}
		sc.close();
	}
}