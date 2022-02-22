package ReadAndWriteInFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;

public class ReadInFile {
	private static String file_Path = "C:/Users/thang.doan/desktop/filetest.txt";
	
	public static void main(String[] args) throws IOException {
		File file = new File(file_Path);
		InputStream is = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(is);
		
		String c = dis.readLine();
		is.close();
		dis.close();
		System.out.println(c);

		
	}
}
