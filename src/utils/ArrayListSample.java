package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSample {
	
	public static void main(String[] args) {
		List<String> fruitsList = new ArrayList<>();
		fruitsList.add("apple");
		fruitsList.add("pear");
		fruitsList.add("orange");
		fruitsList.add("banana");
		System.out.println(fruitsList.get(3));
		fruitsList.set(3, "jackfruit");
		System.out.println(fruitsList);
		for(String fruit : fruitsList) {
			System.out.print(fruit + ",");
		}
		System.out.println();
		System.out.println(fruitsList.size());
		Collections.sort(fruitsList);
		System.out.println("After Sort");
		System.out.println(fruitsList);
		Collections.sort(fruitsList, Collections.reverseOrder());
		System.out.println("After Reverse Sort");
		System.out.println(fruitsList);
		fruitsList.remove(0);
		System.out.println(fruitsList);
		fruitsList.removeIf(filter -> filter == "apple");
		System.out.println(fruitsList);
		fruitsList.clear();
		System.out.println("Clear List: " + fruitsList);
		
		List<Integer> numberList = Arrays.asList(1,45,23,98,22,77);
		List<Integer> copiedList = new ArrayList<>(numberList);
		numberList.sort(Comparator.reverseOrder());
		System.out.println("After reverse sort");
		System.out.println(numberList);
		List<Integer> streamedSortedList = copiedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Streamed Sorted List");
		System.out.println(streamedSortedList);
	}

}
