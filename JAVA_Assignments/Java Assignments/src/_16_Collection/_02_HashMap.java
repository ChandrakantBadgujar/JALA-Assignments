package _16_Collection;

import java.util.HashMap;
import java.util.Map;

public class _02_HashMap {

	public static void main(String[] args) {

		Map<Integer, String> studentMap = new HashMap<>();
		studentMap.put(1, "Dipak");
		studentMap.put(2, "Sonu");
		studentMap.put(3, "Mahesh");
		studentMap.put(4, "Shyam");
		studentMap.put(5, "GAnu");
		studentMap.put(6, "Manoj");
		studentMap.put(7, "Hadik");
		studentMap.put(8, "Bhumika");
		studentMap.put(9, "Kajal");
		studentMap.put(10, "Yatin");

		// insert a Key value mapping into the map
		studentMap.put(11, "Dinesh");

		// fetch the value of a Key
		String name = studentMap.get(5);
		System.out.println(name); 

		// create a clone/copy of HashMap
		Map<Integer, String> studentMapCopy = new HashMap<>(studentMap);

		// check if the given Key is in the Map
		boolean containsKey = studentMap.containsKey(8);
		System.out.println(containsKey); 

		// check if the value is in the Map
		boolean containsValue = studentMap.containsValue("Manoj");
		System.out.println(containsValue); 

		// check if the map is empty
		boolean isEmpty = studentMap.isEmpty();
		System.out.println(isEmpty); 

		// print the size of the Map to the console
		int size = studentMap.size();
		System.out.println(size); 

		// print all the Keys of the map to the console
		for (Integer key : studentMap.keySet()) {
			System.out.println(key);
		}

		// print all the values of the map to the console
		for (String value : studentMap.values()) {
			System.out.println(value);
		}

		// remove a specific Key-value pair
		studentMap.remove(3);

		// copy all the elements of the Map to another Map
		Map<Integer, String> studentMapCopy2 = new HashMap<>();
		studentMapCopy2.putAll(studentMap);

	}

}
