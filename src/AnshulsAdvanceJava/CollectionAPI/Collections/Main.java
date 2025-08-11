package AnshulsAdvanceJava.CollectionAPI.Collections;

import java.util.*;

public class Main {

	// ✅ Java Collection API – Used to store and manage groups of objects

	// 1. Collection (interface)
	// → Main interface for storing objects
	// → List, Set, and Queue come from this
	// → Has basic methods like add(), remove(), size()

	// 2. List (interface)
	// → Ordered collection (index-based)
	// → Allows duplicates
	// → Example: ArrayList, LinkedList

	// 3. Set (interface)
	// → No duplicates allowed
	// → No indexing (unordered or sorted)
	// → Example: HashSet, TreeSet

	// 4. Map (interface) — Not part of Collection
	// → Stores key-value pairs
	// → Keys must be unique
	// → Example: HashMap, TreeMap

	public static void main(String[] args) {

		// ✅ Collection Interface

		// ArrayList using Collection reference (no indexing)
		Collection<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);

		System.out.println(nums); // Output: [1, 2, 3, 4]

		for (Integer num : nums) {
			System.out.println(num); // Prints each number
		}

		// ✅ List Interface

		// ArrayList using List reference (supports indexing)
		List<Integer> nums1 = new ArrayList<>();
		nums1.add(1);
		nums1.add(2);
		nums1.add(3);
		nums1.add(4);

		System.out.println(nums1); // Output: [1, 2, 3, 4]

		for (int i = 0; i < nums1.size(); i++) {
			System.out.println(nums1.get(i)); // Access by index
		}

		// ✅ Set Interface

		// HashSet does not allow duplicates and does not maintain order
		Set<Integer> nums2 = new HashSet<>();
		nums2.add(1);
		nums2.add(2);
		nums2.add(3);
		nums2.add(4);
		nums2.add(4);
		nums2.add(5);
		nums2.add(6);

		for (Integer num : nums2) {
			System.out.println(num); // Output: Unordered unique values
		}

		// ✅ Sorted Set using TreeSet

		// TreeSet automatically sorts the elements and removes duplicates
		TreeSet<Integer> nums3 = new TreeSet<>();
		nums3.add(6);
		nums3.add(2);
		nums3.add(4);
		nums3.add(4); // duplicate
		nums3.add(5);
		nums3.add(5); // duplicate
		nums3.add(6); // duplicate

		for (Integer num : nums3) {
			System.out.println(num); // Output: Sorted unique values: 2, 4, 5, 6
		}

		// ✅ Map Interface

		// HashMap stores key-value pairs, no indexing
		// duplicate keys are not allowed
		// keys follow set order (no duplicates allowed)
		// values follow list order (duplicates allowed)


		Map<Integer, String> nums4 = new HashMap<>();
		nums4.put(1, "Anshul");
		nums4.put(2, "Bhavna");
		nums4.put(3, "Rahul");
		nums4.put(4, "Rohit");
		nums4.put(5, "Rohit"); // duplicate value allowed
		nums4.put(6, "Rohit");

		// Get value using key
		System.out.println(nums4.get(1)); // Output: Anshul

		// Print all keys and values
		System.out.println(nums4); // Output: {1=Anshul, 2=Bhavna, 3=Rahul, 4=Rohit, 5=Rohit, 6=Rohit}

		// Print all keys
		System.out.println(nums4.keySet()); // Output: [1, 2, 3, 4, 5, 6]

		// Print all values and keys together
		for(Integer index : nums4.keySet()) {
			System.out.println(index + " " + nums4.get(index)); // Output: Anshul, Bhavna, Rahul, Rohit, Rohit, Rohit
		}

	}
}
