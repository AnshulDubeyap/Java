package AnshulsJava.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {
	public static void main(String[] args) {
		try {
			FileInputStream fr = new FileInputStream("new-file.txt");
			FileOutputStream fw = new FileOutputStream("new-file3.txt");

			int i;
			while((i = fr.read()) != -1) {
				System.out.println(i);
				fw.write(i);
			}

		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("finally block executed");
		}
	}
}
