package ReadAndWriteInFile;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInFile {
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("C:/Users/thang.doan/desktop/Readinfile.txt");
			DataOutputStream os = new DataOutputStream(fos);
			
			String s = "Hello VietNam";
			os.writeBytes(s);
			
			fos.close();
			os.close();
			System.out.println("ghi ra file thanh cong ");
		}catch (FileNotFoundException e) {
			System.out.println("ghi khong thanh cong");
		}
	}
}
