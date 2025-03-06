package String;

import java.util.HashMap;

public class DuplicateString {
	
	public static void main(String[] args) {
		
		String name=" this is my city this is own city";
		
		String[] split= name.split(" ");
		StringBuffer res= new StringBuffer();
		
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		
		for(int i=0; i<split.length;i++) {
			
			if(!map.containsKey(split[i])) {
				map.put(split[i], 1);
				
				System.out.println("ifffffff" +map);
			}
			map.put(split[i], map.get(split[i])+1);
		}
		System.out.println(map);
		for(String key : map.keySet()) {
			
			if(map.get(key)>1) {
				res.append(key + " " +map.get(key) + " ");
			}
		}
		System.out.println(res);
	}
}
