package AnshulsAdvanceJava.FileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		// Streams: A stream is a sequence of data (bytes or characters) that can be read or written.
		// There are two main types of streams in Java:
		// 1. Byte Streams – For handling binary data (InputStream, OutputStream)
		// 2. Character Streams – For handling text data (Reader, Writer)

		// Predefined Standard Streams in Java:
		// 1. System.in → Standard input stream (reads from keyboard) – Byte stream (InputStream)
		// 2. System.out → Standard output stream (writes to console) – Byte stream (PrintStream)
		// 3. System.err → Standard error stream (writes errors to console) – Byte stream
		// 4. System.console() → Used for interactive console input (returns a Console object)

		// InputStreamReader is a bridge from byte streams to character streams.
		// It reads bytes (like from System.in) and converts them into characters using a character encoding.
		// System.in is an InputStream → it reads raw bytes from the keyboard.

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			System.out.println("Enter characters: ");

			int code = isr.read();

			// read() reads one character at a time and returns its integer Unicode (ASCII) value.
			// For example, typing '5' returns 53, which is the Unicode value for character '5'.
			while (isr.ready()) {
				System.out.print((char) code);
				code = isr.read();
			}
			isr.close();
			System.out.println();
		} catch (IOException e) {
			System.out.println("An error occurred while reading input: " + e.getMessage());
		}

		// FileReader → Reads text from a file using a character stream
		try {
			FileReader fr = new FileReader("input.txt");
			int letters = fr.read();
			while (fr.ready()) {
				System.out.print((char) letters);
				letters = fr.read();
			}
			fr.close();
			System.out.println();
		} catch (IOException e) {
			System.out.println("An error occurred while reading file: " + e.getMessage());
		}

		// BufferedReader → Reads text efficiently using a buffer, especially useful for reading entire lines.
		// It accepts a character stream as input, not a byte stream.
		// So, we convert System.in (byte stream) to InputStreamReader (character stream),
		// then pass it to BufferedReader.
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("You typed: " + br.readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		//OutputStream → Writes data to a file using byte stream

		try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
			osw.write("Hello World");
			osw.write(97);
			osw.write(10);
			osw.write('A');
			osw.write('\n');
			char[] arr = "hello world".toCharArray();
			osw.write(arr);
			// osw.write(😍);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// FileWriter → Writes data to a file using character stream (overwrites the file)
		try (FileWriter fw = new FileWriter("note.txt")) {
			fw.write("this should be appended");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// FileWriter → Appends data to a file using a character stream
		try (FileWriter fw = new FileWriter("note.txt", true)) {
			fw.write("this should be appended");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// BufferedWriter → Writes data to a file using a character stream
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt", true))) {
			bw.write("this is writed using BufferedWriter");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
