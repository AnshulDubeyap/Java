package AnshulsAdvanceJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	// Stream --> stream is a new concept, where it creates a copy of the data, and it can be used to perform operations on it.
	// it does not change the original data
	// once we used stream(), we cannot use it again (we can use stream only once)

	// forEach() --> used to perform operations on each element of the stream, list

	// filter() --> used to filter the elements of the stream

	// reduce() --> used to reduce the elements of the stream

	// map() --> used to map the elements of the stream


	public static void main(String[] args) {

		// Create a list of integers
		// A new way to create a list and add elements to it
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// print each element of the list using forEach()
		nums.forEach(num -> System.out.println(num));

		// using the stream() method

		Stream<Integer> S1 = nums.stream();

		// What is the use of stream() method?
		// stream brings us various methods , like filter(), map(), sorted(), etc

		// filter the even numbers
		Stream<Integer> S2 = S1.filter(num -> num % 2 == 0);

		// double the value of even numbers
		Stream<Integer> S3 = S2.map(num -> num * 2);

		// add the numbers
		int sum = S3.reduce(0, (c, e) -> c + e);
		// here 0 is the initial value, and 'a' is the carry-over value, and 'b' is the current value
		System.out.println(sum); // output = 60

		// We can also do all the above in one line
		int sum2 = nums.stream().filter(num -> num % 2 == 0).map(num -> num * 2).reduce(0, (c, e) -> c + e);
		System.out.println(sum2); // output = 60

	}
}
