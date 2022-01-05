import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_Problem1 
{
	public int[] twoSum(int[] nums, int target) 
	{
		int arr[]=new int[2];
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++)
		{
			hm.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++)
		{
			int reqVal=target-nums[i];
			if(hm.containsKey(reqVal) && (i!=hm.get(reqVal)))
			{
				arr[0]=i;
				arr[1]=hm.get(reqVal);
				break;
			}
		}
		return nums[arr[0]]+nums[arr[1]]==target?arr:null;
    }
	public static void main(String[] args) 
	{
		TwoSum_Problem1 s=new TwoSum_Problem1();
		int nums[]= {3,3};
		int target=6;
		System.out.println(Arrays.toString(s.twoSum(nums, target)));
	}
}