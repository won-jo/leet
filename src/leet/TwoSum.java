package leet;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			if(map.get(target - nums[i]) != null)
				return new int[] {map.get(target - nums[i]), i};
			else
				map.put(nums[i], i);
		}
		
		return new int[] {};
	}
}
