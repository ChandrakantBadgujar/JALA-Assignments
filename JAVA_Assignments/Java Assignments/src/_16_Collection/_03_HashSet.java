package _16_Collection;

import java.util.HashSet;

public class _03_HashSet {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		set.add("apple");
		set.add("banana");
		set.add("cherry");
		set.add("date");
		set.add("elderberry");
		set.add("fig");
		set.add("grape");
		set.add("honeydew");
		set.add("kiwi");
		set.add("lemon");

		// Print the contents of the set
		System.out.println("HashSet contains: " + set);

		// Check if the set contains an element
		System.out.println("HashSet contains 'banana': " + set.contains("banana"));

		// Remove an element from the set
		set.remove("cherry");
		System.out.println("HashSet after removing 'cherry': " + set);

		// Get the size of the set
		System.out.println("Size of HashSet: " + set.size());

	}

}
