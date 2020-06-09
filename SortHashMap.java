package TaskEight;

import java.util.*;

public class SortHashMap {

	public static void sortBykey(Map<Integer, String> map) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.putAll(map);
		for (Map.Entry<Integer, String> entry : treemap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}
	}

	public static void sortByValue(Map<Integer, String> map) {
		 List<Map.Entry<Integer, String>> listOfEntry = new LinkedList<>(map.entrySet());
		 Collections.sort(listOfEntry, new Comparator<Map.Entry<Integer, String>>() 
	        {
	            @Override
	            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) 
	            {
	                return o1.getValue().compareTo(o2.getValue());
	            }
	        });
		 
		 Map<Integer, String> sortedIdNameMap = new LinkedHashMap<Integer, String>();
         
	        for (Map.Entry<Integer, String> entry : listOfEntry) 
	        {
	            sortedIdNameMap.put(entry.getKey(), entry.getValue());
	        }
	        System.out.println(sortedIdNameMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(12, "influenza");
		map.put(18, "hola");
		map.put(2, "bola");
		map.put(10, "ebola");
		map.put(1, "covid");
		map.put(3, "hiv");
		
		sortBykey(map);
		sortByValue(map);
		
	}

}
