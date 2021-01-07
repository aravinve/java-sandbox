package utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetSample {
	public static void main(String[] args) {
		HashSet<Integer> sampleSet = new HashSet<>();
		sampleSet.add(10);
		sampleSet.add(20);
		// set is unique. this 20 will not be added.
		sampleSet.add(20);
		sampleSet.add(23454);
		sampleSet.add(1342);
		sampleSet.add(6730);
		sampleSet.add(560);
		System.out.println(sampleSet);
		System.out.println(sampleSet.contains(20));
		sampleSet.remove(1342);
		System.out.println(sampleSet);
		sampleSet.removeIf(filter -> filter < 100);
		System.out.println(sampleSet);
		System.out.println(sampleSet.size());
		// Sort HashSet using TreeSet
		TreeSet<Integer> sampleTreeSet = new TreeSet<>();
		sampleTreeSet.addAll(sampleSet);
		System.out.println(sampleTreeSet);
		
		Iterator<Integer> iterator = sampleSet.iterator();
		while(iterator.hasNext()) {
			Integer curr = iterator.next();
			if(curr < 2000) {
				System.out.println(curr);
			}
		}
		
	}
}
