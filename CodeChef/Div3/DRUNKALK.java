import java.util.Scanner;

public class DRUNKALK 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int time=sc.nextInt();
			int evenStep=time/2;
			long dist=((time-evenStep)*3)-evenStep;
			System.out.println(dist);
		}
		sc.close();
	}
}