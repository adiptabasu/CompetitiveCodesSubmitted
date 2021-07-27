//https://codeforces.com/contest/1551/problem/B1

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class WonderfulColoring1374B1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		for(int i=0;i<num;i++)
		{
			System.out.println(redColoured(sc.nextLine()));
		}
		sc.close();
	}
	public static void updateHistogram(String input, HashMap<String, Integer> histogram)
	{
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(histogram.containsKey(Character.toString(ch)))
			{
				histogram.replace(Character.toString(ch), histogram.get(Character.toString(ch))+1);
			}
			else
			{
				histogram.put(Character.toString(ch), 1);
			}
		}
	}
	public static int redColoured(String input)
	{
		int output=0;
		int red,green;
		red=green=0;
		HashMap<String, Integer> histogram=new HashMap<String, Integer>();
		updateHistogram(input, histogram);
		for(Map.Entry<String,Integer> mapElement: histogram.entrySet())
		{
			int val=(int) mapElement.getValue();
			if(val==1)
			{
				if(green>=red)
				{
					red+=1;
				}
				else
				{
					green++;
				}
			}
			else if(val>1)
			{
				green++;
				red++;
			}
		}
		output=green>=red?red:green;
		return output;
	}
}