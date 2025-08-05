package AnshulsJava.FileHandling;

import java.io.FileReader;
import java.io.FileWriter;


public class CharacterStream {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("new-file.txt");
			FileWriter fw = new FileWriter("new-file2.txt");


			int i;
			while ((i = fr.read()) != -1) {
				fw.write(i);
			}

			fr.close();
			fw.close();
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("finally block executed");
		}
	}
}
