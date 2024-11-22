//https://www.codechef.com/problems/NUGGET
package practice;

import java.util.Scanner;

public class NUGGET 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		String inputs[]=input.split(" ");
		
		int x=Integer.parseInt(inputs[0]);
		int y=Integer.parseInt(inputs[1]);
		
		int output=(x*5000)+(y*9800);
		
		System.out.println(output);
		
		sc.close();
	}
}