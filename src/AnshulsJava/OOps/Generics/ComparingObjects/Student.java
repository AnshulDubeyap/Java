package AnshulsJava.OOps.Generics.ComparingObjects;

// to compare the objects, we need an interface comparable
public class Student implements Comparable<Student>{
	int rollNo;
	float marks;

	Student(int rollNo, float marks){
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public String toString() {
		return "rollNo = " + rollNo;
	}

// implementing the compareTo method from the Comparable interface
	@Override
	public int compareTo(Student o) {

		// comparing two objects marks and returning the result
		if(this.marks > o.marks)
			return 1;
		else if(this.marks < o.marks)
			return -1;
		else
			return 0;
	}
}
