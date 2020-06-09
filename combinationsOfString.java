package TaskEight;

import java.util.*;

public class combinationsOfString {

	static Set<String> res1 = new HashSet<>();

	static void permutations(String str, String res) {
		if (str.length() == 0) {
			res1.add(res + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			permutations(ros, res + ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abb";
		permutations(str, "");
		for (String a : res1) {
			System.out.println(a);
		}
	}

}
