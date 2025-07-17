package AnshulsJava.OOps.Generics.ComparingObjects;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student anshul = new Student(101, 90.0f);

		Student rahul = new Student(102, 85.0f);

		// comparing two objects
		int result = anshul.compareTo(rahul);

		if (result > 0)
			System.out.println("Anshul has more marks than Rahul");
		else if (result < 0)
			System.out.println("Rahul has more marks than Anshul");
		else
			System.out.println("Anshul and Rahul have same marks");

		Student cambam = new Student(103, 80.0f);
		Student Jimmy = new Student(104, 75.0f);
		Student Sachin = new Student(102, 85.0f);


		// creating an array of objects
		Student[] listOfStudents = { anshul, rahul, cambam, Jimmy, Sachin };

		// sorting the array of objects
		Arrays.sort(listOfStudents);

		// printing the sorted array
		// sorted with respect to marks
		System.out.println(Arrays.toString(listOfStudents));

	}
}
