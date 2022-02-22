package FileInputStreamAndFileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreammm {
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("C:/Users/thang.doan/desktop/filetest.txt");
			String s = "Xin chao VietNam";
			byte[] b = s.getBytes();
			fos.write(b);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
