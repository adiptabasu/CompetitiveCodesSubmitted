
public class PalindromeNumber_Problem9
{
	public static void main(String[] args) 
	{
		PalindromeNumber_Problem9 pp = new PalindromeNumber_Problem9();
		System.out.println(pp.isPalindrome(1231));
	}
	public boolean isPalindrome(int x)
	{
		boolean palindrome=false;
		int temp=x;
		int revNum=0;
		while(temp>0)
		{
			revNum=(revNum*10)+(temp%10);
			temp/=10;
		}
		if(revNum==x)
			palindrome=true;
		return palindrome;
    }
}