package AnshulsAdvanceJava.Serialization;

// For an object to be serializable, it must implement the Serializable interface

import java.io.Serializable;

public class Student implements Serializable {
	private int rollNo;
	private String name;
	private float marks;

	transient int count; // 'transient' keyword marks this field as non-serializable (it won't be serialized)

	// Serial version UID
	// This is a unique identifier used during deserialization to verify
	private static final long serialVersionUID = 1L;

	// Constructor
	public Student(int rollNo, String name, float marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	// Setters
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void setCount(int count) {
		this.count = count;
	}

	// Getters
	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public float getMarks() {
		return marks;
	}
	public int getCount() {
		return count;
	}

	// toString() method
	@Override
	public String toString() {
		return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
	}

}
