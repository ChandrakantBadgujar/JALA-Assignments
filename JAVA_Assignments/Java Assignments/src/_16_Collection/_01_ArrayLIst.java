package _16_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class _01_ArrayLIst {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(10);

		// Add 10 elements to the ArrayList
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("date");
		list.add("elderberry");
		list.add("fig");
		list.add("grape");
		list.add("honeydew");
		list.add("kiwi");
		list.add("lemon");

		// Add an element to the ArrayList
		list.add("mango");

		// Iterate through the ArrayList by using Iterator object
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

		// Add an element at a specific index
		list.add(3, "orange");

		// Remove an element from the ArrayList
		list.remove("kiwi");

		// Remove at an index
		list.remove(7);

		// Update the element at a specific index
		list.set(2, "grapefruit");

		// Check if an element is present at a particular index
		boolean present = list.contains("banana");
		System.out.println("Is banana present? " + present);

		// Get an element at a particular index
		String element = list.get(5);
		System.out.println("Element at index 5: " + element);

		// Find out the size of the ArrayList
		int size = list.size();
		System.out.println("Size of ArrayList: " + size);

		// Check if a given element is present in the ArrayList
		boolean contains = list.contains("lemon");
		System.out.println("Does ArrayList contain lemon? " + contains);

		// Remove all elements of the ArrayList
		list.clear();
		System.out.println("ArrayList after removing all elements: " + list);

	}

}
