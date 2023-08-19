package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	
	public static void main(String [] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("테스트1", 85);
		map.put("테스트2", 81);
		map.put("테스트3", 35);
		map.put("테스트4", 84);
		map.put("테스트5", 65);
		System.out.println("총 Entry 수 : "+map.size());
		
		//객체 찾기
		System.out.println("\t테스트1 : "+map.get("테스트1"));
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key + " : "+value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("테스트2");
		System.out.println("총 Entry 수 : "+map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryItr = entrySet.iterator();
		
		while(entryItr.hasNext()) {
			Map.Entry<String,Integer> entry = entryItr.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+ key + " : "+value);
		}
		System.out.println();
		 
		map.clear();
		System.out.println("총 Entry 수 : "+map.size());
	}

}
