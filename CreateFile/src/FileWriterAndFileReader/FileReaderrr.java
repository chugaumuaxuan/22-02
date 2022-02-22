package FileWriterAndFileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderrr {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:/Users/thang.doan/desktop/FileWriter.txt");

		
		int i;
			while((i = fr.read()) != -1) {
				System.out.println((char) i);
			}
			fr.close();
			
			
	}
}
