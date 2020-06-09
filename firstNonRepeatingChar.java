package TaskEight;

import java.util.*;

public class firstNonRepeatingChar {

	public static void main(String[] args) {
		 Map<Character, Integer> map=new HashMap<>();
		 
		 
	       String s="mamal";
	        
	        for(int i=0; i<s.length();i++){
	            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
	           
	        }
	         for(int i=0; i<s.length();i++){
	             if(map.get(s.charAt(i))==1){
	                 System.out.println(s.charAt(i)); 
	                 break;
	             }
	         }
	        
	}

}
