import java.util.Arrays;
import java.util.Scanner;

public class CALPOWER 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t =Integer.parseInt(sc.nextLine());
		while(t-->0)
		{
			long pow=0;
			try 
			{
				String str[]=sc.nextLine().toLowerCase().split("");
				Arrays.sort(str);
				for(int i=0;i<str.length;i++)
				{
					char ch=str[i].charAt(0);
					int charVal=ch;
					pow+=(charVal-96)*(i+1);
				}
			}catch (Exception e) 
			{
				pow=0;
			}
			pow=pow<0?0:pow;
			System.out.println(pow);	
		}
		sc.close();
	}
}