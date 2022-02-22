package FileWriterAndFileReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterrr {
	public static void main(String[] args) throws IOException {
		File outFile = new File("C:/Users/thang.doan/desktop/FileWriter.txt");
		
		outFile.createNewFile();
		
		FileWriter filewriter = new FileWriter(outFile);
		
		filewriter.write("Hello");
		filewriter.write("\n");
		filewriter.write("VietNam");
		filewriter.close();
	}
}
