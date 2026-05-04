package test;

import java.util.HashMap;

public class Int_Array_duplicates_find {

	public static void main(String[] args) {
		

		
		        int[] arr = {1,2,3,4,5,6,7,8,1,2,3,4};

		        HashMap<Integer, Integer> map = new HashMap<>();

		        // Count occurrences
		        for (int num : arr) {
		            map.put(num, map.getOrDefault(num, 0) + 1);
		        }

		        // Print duplicates with count
		        for (int num : map.keySet()) {
		            if (map.get(num) > 1) {
		                System.out.println(num + " repeated " + map.get(num) + " times");
		            }
		        }

	}

}
