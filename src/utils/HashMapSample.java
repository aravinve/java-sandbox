package utils;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSample {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "John");
		map.put(2, "Peter");
		map.put(3, "Cathy");
		map.put(4, "Robert");
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.containsKey(200));
		for(Integer i : map.keySet()) {
			System.out.println(map.get(i));
		}
		for(String s: map.values()) {
			System.out.println(s);
		}
		map.remove(2);
		System.out.println(map);
		System.out.println(map.size());
		map.replace(1, "Joffery");
		System.out.println(map);
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		entrySet.stream().forEach(entry -> {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		});
		map.clear();
		System.out.println("Cleared map: " + map);
	}
}
