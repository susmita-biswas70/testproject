package LeetCode;
import java.util.*;
public class ArrayTwoSum {
   public static int[] twoSum(int[] nums, int target) {
        List<Integer> arraylist=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                arraylist.add(i);
                arraylist.add(j);
                break;
            }
            }
            
            
        }
        int[] ans=new int[arraylist.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=arraylist.get(i).intValue();
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  nums = {2,7,11,15};
		int target = 9;
		int[] ans;
		ans=twoSum(nums,target);
		for(int i:ans) {
			System.out.print(ans[i]+" ");
		}
//		System.out.println(ans);
	}

}
