package AnshulsAdvanceJava.CollectionAPI.Sorting;

import java.util.*;

public class Main {

	// Collections.sort() --> sort a list, its method of the Collections class
	// Comparator --> interface, that is used to write our own logic, by overriding the compare method
	// Comparator is a functional interface, thus we can use lambda functions and inner classes
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(43);
		list.add(31);
		list.add(72);
		list.add(49);

		System.out.println(list); // Output: [43, 32, 56, 12]

		// Sorts the list in ascending order
		Collections.sort(list);

		System.out.println(list); // Output: [12, 32, 43, 56]

		// What if I want to sort using my own logic? , let's say I want to sort by the last digit
		// --> by using comparator interface

		// creating a comparator with an anonymous class
		Comparator<Integer> comp = new Comparator<Integer>() {
			// override the compare method in the Comparator interface
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 % 10 > o2 % 10) {
					return 1; // 1 means swap (in this case)
				}else if(o1 % 10 < o2 % 10) {
					return -1; // -1 means don't swap
				}else {
					return 0;
				}
			}
		};

		list.sort(comp);

		System.out.println(list); // Output: [12, 32, 43, 56]


		// Another challenge: Sort the String array by lengths of the Strings

		List<String> list1 = new ArrayList<String>();
		list1.add("highway to hell");
		list1.add("Cambam120");
		list1.add("pikachu");
		list1.add("crossbowman");
		list1.add("Anshul");

		Comparator<String> comp1 = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()){
					return 1;
				}else{
					return -1;
				}
			}
		};

		System.out.println(list1); // output = [highway to hell, Cambam120, pikachu, crossbowman, Anshul]

		list1.sort(comp1);

		System.out.println(list1); // output = [Anshul, pikachu, Cambam120, crossbowman, highway to hell]

		// Writing the above code with lambda expressions and inner classes and ternary operator

		Comparator<String> comp3 = (o1, o2) -> o1.length() > o2.length() ? 1 : -1;

		// We can reduce so much code by using different syntaxes


		// Let's do one more thing, create a student class, then we create a list of students with age and name thus sorting them by age
		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student(23, "Anshul"));
		studentList.add(new Student(21, "Rahul"));
		studentList.add(new Student(22, "Sachin"));
		studentList.add(new Student(25, "Jimmy"));
		studentList.add(new Student(24, "Cambam"));


		Comparator<Student> comp2 = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.age > o2.age) {
					return 1;
				}else if(o1.age < o2.age) {
					return -1;
				}else {
					return 0;
				}
			}
		};

		System.out.println(studentList);

		studentList.sort(comp2);

		System.out.println(studentList);


	}



}
