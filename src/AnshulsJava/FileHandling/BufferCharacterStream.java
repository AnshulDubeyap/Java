package AnshulsJava.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferCharacterStream {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("new-file.txt");
			FileWriter fw = new FileWriter("new-file5.txt");

			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);

			int i;
			while ((i = br.read()) != -1) {
				System.out.println(i);
				bw.write(i);
			}

			br.close();
			bw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
