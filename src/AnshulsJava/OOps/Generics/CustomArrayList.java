package AnshulsJava.OOps.Generics;

import java.util.ArrayList;

class Students{
	int rollNo;
	float marks;
	String name;

	Students(int rollNo, float marks, String name){
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}
}

public class CustomArrayList {

	private int[] data; // array of integers

	private static final int DEFAULT_CAPACITY = 10; // default capacity

	private int size = 0;

	// constructor for creating ArrayList
	public CustomArrayList() {
		this.data = new int[DEFAULT_CAPACITY];
	}

	// create method resize
	private void resize() {
		int[] temp = new int[data.length * 2];

		for(int i = 0; i< data.length; i++){
			temp[i] = data[i];
		}

		data = temp;
	}

	// create a method isFull()
	private boolean isFull() {
		return size == data.length;
	}

	// method for adding elements
	public void add (int num){
		// If ArrayList is full, double the capacity
		if(isFull()){
			resize();
		}
		data[size++] = num;
	}

	// method for removing elements
	public int remove(){
		return data[--size];
	}

	// method for getting elements
	public int get(int index){
		return data[index];
	}

	// method for setting elements
	public void set(int index, int num){
		data[index] = num;
	}


	public static void main(String[] args) {

		// create an object of ArrayList
		CustomArrayList list = new CustomArrayList();

		// add elements to the ArrayList
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);

		// get the element at index 3
		System.out.println(list.get(3)); // output = 40

		// remove the last element
		System.out.println(list.remove()); // output = 100

		// Problem: We cannot use Strings or other non-primitive data types in custom ArrayList
		// Solution: Use Generics



		// Student object
		Students Anshul = new Students(101, 89.9f, "Anshul Dubey");
		Students Cambam = new Students(102, 98.5f, "Cambam120");
		Students Ankit = new Students(103, 88.75f, "Ankit Dubey");


		// get an ArrayList
		ArrayList<Students> list1 = new ArrayList<>();
		list1.add(Anshul);
		list1.add(Cambam);
		list1.add(Ankit);

		// print the ArrayList
		for(int i = 0; i< list1.size(); i++){
			System.out.println(list1.get(i).rollNo + " " + list1.get(i).marks + " " + list1.get(i).name);
		}


	}
}
