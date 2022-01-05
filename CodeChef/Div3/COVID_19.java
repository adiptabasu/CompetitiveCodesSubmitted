import java.util.Scanner;

public class COVID_19 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int i=sc.nextInt();
			int j=sc.nextInt();
			i=(int) Math.ceil((float)i/2);
			j=(int) Math.ceil((float)j/2);
			System.out.println(i*j);
		}
		sc.close();
	}
}