//Link:https://www.codechef.com/START6C/problems/THREDICE

import java.util.Scanner;

public class THREDICE 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		byte num=Byte.parseByte(sc.nextLine());
		for(int i=0;i<num;i++)
		{
			String faces[]=sc.nextLine().split(" ");
			int sum=Integer.parseInt(faces[0])+Integer.parseInt(faces[1]);
			float prob=0;
			if(sum<6)
			{
				prob=6-sum;
				prob/=6;
			}
			if(prob==0)
			{
				System.out.print(0);
			}
			else
			{
				System.out.printf("%.6f",prob);
			}
			if(i<num-1)
			{
				System.out.println();
			}
		}
		sc.close();
	}
}