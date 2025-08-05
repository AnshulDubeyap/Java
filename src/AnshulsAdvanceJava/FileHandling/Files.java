package AnshulsAdvanceJava.FileHandling;


import java.io.*;

public class Files {
	public static void main(String[] args) {
		// FileClass -> A class that represents a file on the file system.
		// It provides methods to create, read, write, and delete files.

		// create
		try {
			File fo = new File("new-file.txt");
			fo.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// write in the file
		try {
			FileWriter fw = new FileWriter("new-file.txt");
			fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज, अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// reading from a file
		try (BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))) {
			while (br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// delete a file
		try {
			File fo = new File("random.txt");
			fo.createNewFile();
			if(fo.delete()) {
				System.out.println(fo.getName());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
