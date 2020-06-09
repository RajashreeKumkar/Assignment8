package TaskEight;

import java.util.*;

public class IntersectionArray {
	
		  public static int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
		    int [] output = new int[set1.size()];
		    int idx = 0;
		    for (Integer s : set1)
		      if (set2.contains(s)) output[idx++] = s;

		    return Arrays.copyOf(output, idx);
		  }

		  public static int[] intersection(int[] nums1, int[] nums2) {
		    HashSet<Integer> set1 = new HashSet<Integer>();
		    for (Integer n : nums1) set1.add(n);
		    HashSet<Integer> set2 = new HashSet<Integer>();
		    for (Integer n : nums2) set2.add(n);

		    if (set1.size() < set2.size()) return set_intersection(set1, set2);
		    else return set_intersection(set2, set1);
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1=new int[]{1,2,2,1};
		int[] arr2=new int[]{2,2};
		int[] out=IntersectionArray.intersection(arr1,arr2);
		for(int i:out) {
			System.out.println(i);
		}
	}

}
