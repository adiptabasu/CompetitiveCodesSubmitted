import java.util.Scanner;

public class DEVSPORTS 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int z=sc.nextInt();
			int y=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			System.out.println((z-y)<(a+b+c)?"NO":"YES");
		}
		sc.close();
	}
}
