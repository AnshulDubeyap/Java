package AnshulsJava.FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferByteStream {
	public static void main(String[] args) {


		try {
			FileInputStream fr = new FileInputStream("new-file.txt");
			FileOutputStream fw = new FileOutputStream("new-file4.txt");

			BufferedInputStream br = new BufferedInputStream(fr);
			BufferedOutputStream bw = new BufferedOutputStream(fw);

			int i;
			while((i = br.read()) != -1) {
				System.out.println(i);
				bw.write(i);
			}

			br.close();
			bw.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
