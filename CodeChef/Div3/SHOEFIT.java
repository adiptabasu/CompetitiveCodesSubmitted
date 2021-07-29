//Link:https://www.codechef.com/problems/SHOEFIT

import java.util.Scanner;

public class SHOEFIT 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			boolean isLeft,isRight;
			isLeft=isRight=false;
			for(int j=0;j<3;j++)
			{
				int there=sc.nextInt();
				if(there==0)
				{
					isLeft=true;
				}
				else if(there==1)
				{
					isRight=true;
				}
			}
			if(isLeft && isRight)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
		}
		sc.close();
	}
}