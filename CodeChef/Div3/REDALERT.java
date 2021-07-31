import java.util.Scanner;

public class REDALERT 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			int numOfDays=sc.nextInt();
			int waterLevelDown=sc.nextInt();
			int redAlertLevel=sc.nextInt();
			int dailyWaterLevel[]=new int[numOfDays];
			for(int j=0;j<numOfDays;j++)
			{
				dailyWaterLevel[j]=sc.nextInt();
			}
			System.out.println(getRedAlertOrNot(waterLevelDown, redAlertLevel, dailyWaterLevel));
		}
		sc.close();
	}
	public static String getRedAlertOrNot(int waterLevelDown,int redAlertLevel,int[] dailyWaterLevel)
	{
		String output="NO";
		long currentLevel=0;
		for(int i=0;i<dailyWaterLevel.length;i++)
		{
			if(dailyWaterLevel[i]<=0)
			{
				currentLevel-=waterLevelDown;
				if(currentLevel<0)
				{
					currentLevel=0;
				}
			}
			else
			{
				currentLevel+=dailyWaterLevel[i];
				if(currentLevel>redAlertLevel)
				{
					output="YES";
					break;
				}
			}
		}
		return output;
	}
}
