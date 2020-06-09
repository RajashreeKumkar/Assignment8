package TaskEight;

import java.util.*;

public class UniqueChars {

	public static boolean findunique(String str) {
		Set<Character> set=new HashSet<>();
		char[] c=str.toCharArray();
		for(char a:c) {
			if(!set.add(a)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="india";
		System.out.println(UniqueChars.findunique(str));
		
	}

}
