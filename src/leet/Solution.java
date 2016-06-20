package leet;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int result = 0;
		Integer n;
		
		for(int i = 0; i < s.length(); i++) {
			if((n = map.put(s.charAt(i), i)) != null) {
				result = result < map.size() ? map.size() : result;
				
				for(int j = i - map.size(); j < n; j++)
					map.remove(s.charAt(j));
			}
		}
		return result < map.size() ? map.size() : result;
	}

}
