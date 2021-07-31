import java.util.Scanner;

public class CHFSPL 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			long total=0;
			int min=0;
			for(int j=0;j<3;j++)
			{
				int temp=sc.nextInt();
				total+=temp;
				if(j==0)
				{
					min=temp;
				}
				else
				{
					if(min>temp)
					{
						min=temp;
					}
				}
			}
			System.out.println(total-min);
		}
		sc.close();
	}
}