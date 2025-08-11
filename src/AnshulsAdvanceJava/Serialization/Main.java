package AnshulsAdvanceJava.Serialization;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		// Serialization -> A process of converting a Java object into a stream of bytes,
		// which can be stored in a file or memory buffer, or transmitted over a network.
		// Deserialization -> A process of converting a stream of bytes into a Java object.

		// Serialization helps us to convert a Java object into a stream of bytes, which can be stored in a file or memory buffer, or transmitted over a network.
		// Deserialization helps us to convert a stream of bytes into a Java object

		// Student object
		Student anshul = new Student(101, "Anshul Dubey", 89.9f);

		// Serialization
		String fileName = "student.ser";
		FileOutputStream fileOut =  null;
		ObjectOutputStream objOut = null;

		// try and catch block
		try {
			fileOut = new FileOutputStream(fileName);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(anshul); // write the student object to the file

			objOut.close();
			fileOut.close();

			System.out.println("Object has been serialized : " + anshul);

		}catch(Exception e) {
			System.out.println(e);
		}

		// Deserialization

		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;

		try {
			fileIn = new FileInputStream(fileName);
			objIn = new ObjectInputStream(fileIn);
			Student anshul2 = (Student)objIn.readObject(); // read the student object from the file
			// casting is done because readObject() property does not know what type of object to read

			System.out.println("Object has been deserialized : " + anshul2);

			objIn.close();
			fileIn.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}
}
