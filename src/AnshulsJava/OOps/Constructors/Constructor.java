package AnshulsJava.OOps.Constructors;

public class Constructor {
	public static void main(String[] args) {
		// Constructor in Java is the special type of function in the class
		// that runs when you create an object. It helps us to not use the '.' everytime
		// we want to create something

		Student students = new Student();

		// Using the constructor to create an object
		Student Anshul = new Student();
		System.out.println(Anshul.name); // output = Anshul Dubey
		System.out.println(Anshul.rollNo); // output = 101
		System.out.println(Anshul.marks); // output = 89.9

		// Using the constructor with arguments to create an object
		Student Cambam = new Student(102, "Cambam120", 98.5f);

		System.out.println(Cambam.marks); // output = 98.5
		System.out.println(Cambam.name); // output = Cambam120
		System.out.println(Cambam.rollNo); // output = 102

		// Using 'this' keyword for calling a constructor inside another constructor

		Books book = new Books();

		Books GameOfThrones = new Books();
		System.out.println(GameOfThrones.author); // output = Georege.RR.Martin
		System.out.println(GameOfThrones.title); // output = Song of Ice and Fire
		System.out.println(GameOfThrones.bookNo); // output = 233


	}

	static class Student{
		int rollNo;
		String name;
		float marks;

		// Making a constructor (the name is not required, have same return type as class(Student))
		Student(){

			// 'this' keyword is replaced with the object Anshul, (this.name == Anshul.name)
			this.name = "Anshul Dubey";
			this.marks = 89.9f;
			this.rollNo = 101;
		}

		// Making a constructor with arguments
		Student(int rollNo, String name, float marks){
			this.rollNo = rollNo;
			this.name = name;
			this.marks = marks;
		}
	}

	static class Books{
		String title;
		int bookNo;
		String author;

		Books(){
			// Using 'this' keyword to call another Constructor
			this("Song of Ice and Fire", "Georege.RR.Martin", 233);
		}

		Books( String called, String writtenBy, int index){
			this.author = writtenBy;
			this.bookNo = index;
			this.title = called;
		}
	}
}