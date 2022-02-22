package FileInputStreamAndFileOutputStream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreammm {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("C:/Users/thang.doan/desktop/filetest.txt");
			int i;
			while((i = fin.read()) != -1) {
				System.out.println((char)i);		
			}	
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	

}
