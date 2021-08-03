import java.util.Scanner;

public class CEILSUM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int x=0;
			if(a>b)
			{
				x=a-1;
			}
			else if(b>a)
			{
				x=b-1;
			}
			else
			{
				x=a;
			}
			System.out.println((int)(Math.ceil((double)(b-x)/2)+Math.ceil((double)(x-a)/2)));
		}
		sc.close();
	}
}