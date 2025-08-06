package AnshulsJava.OOps.ConstructorsAndThis;

public class Books {
	String title;
	int bookNo;
	String author;

	// Constructor (default constructor)
	Books(){
		// Using 'this' keyword to call another Constructor inside a constructor,

		// we cannot use 'Books(String called, String writtenBy, int index)' inside another constructor
		// because that would try to create a new object instead of reusing the current one,

		// and Java does not allow that in a constructor. We must use 'this(...)' instead
		// which means: call another constructor of this same class for the current object.

		this("Song of Ice and Fire", "Georege.RR.Martin", 233);
	}

	// Constructor with arguments
	Books(String called, String writtenBy, int index){
		this.author = writtenBy;
		this.bookNo = index;
		this.title = called;
	}
}
