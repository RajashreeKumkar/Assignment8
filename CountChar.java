package TaskEight;

import java.util.*;

public class CountChar {

	public static void main(String[] args) {
		String str="hola pola";
		int len=str.length();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i<len; i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i)) +1);
            }
            else
            {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println("The occurences of words are");
        System.out.print(map);
	}

}
