package AnshulsJava.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
	public static void main(String[] args) {
		// ArrayList is a dynamic array, it can grow and shrink as needed

		//Syntax
		ArrayList<Integer> list = new ArrayList<>(10);
		// ArrayList is a class
		// <Integer> is the data type (wrapper class)
		// the list is the variable name(reference variable)
		// 10 is the initial capacity (constructor)

		// Adding elements to the ArrayList
		list.add(10);
		list.add(20);
		list.add(30);

		// Printing the ArrayList
		System.out.println(list); // output = [10, 20, 30] (no need for toString method)

		// Various methods of ArrayList
		System.out.println(list.size()); // output = 3 (number of elements in the ArrayList)
		System.out.println(list.get(1)); // output = 20 (element at index 1)
		list.remove(1); // removes the element at index 1
		System.out.println(list); // output = [10, 30]
		System.out.println(list.contains(30)); // output = true
		list.set(1, 40); // sets the element at index 1 to 40
		System.out.println(list); // output = [10, 40]


		// ArrayList of Strings
		ArrayList<String> list1 = new ArrayList<>(10);
		list1.add("Anshul");
		list1.add("Kumar");
		System.out.println(list1);

		// Inputs in an ArrayList
		ArrayList<Integer> list2 = new ArrayList<>(10);

		Scanner input = new Scanner(System.in);
		for(int i = 0; i<10; i++){
			list2.add(input.nextInt());
		}
		System.out.println(list2);

		// Internal working of ArrayList
		// When an ArrayList is created, it has a default capacity of 10.
		// When an element is added to the ArrayList, if element count in arrayList reaches certain criteria (like 90% of capacity), then the capacity doubles.
	}
}
