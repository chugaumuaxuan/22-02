package CreateFileAndFolder;

import java.io.*;

public class test1 {
	public static void main(String[] args) {
			
		//tao file
		File filetest = new File("C://Users/thang.doan/desktop/filetest.txt");
		try {
			if(filetest.createNewFile()) {
				System.out.println("filetest is created");
			}else {
				System.out.println("filtest isnt created");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 	
		
//		//tao folder
		File dir1 = new File("C://Users/thang.doan/desktop/newFolder1/newFolder2/newFolder3");
//		
//		System.out.println("Duong dan cua file: " + dir1.getAbsolutePath());
//		System.out.println("Kiem tra co ton tai folder chua? " + dir1.exists());
//		System.out.println("File cha da ton tai chua? " + dir1.getParentFile().exists());
//		
//		dir1.mkdir(); //chi tao file khi folder cha da ton tai
		
		if(dir1.mkdirs()) { //mkdirs tao ca file cha
			System.out.println("da tao folder moi");
		}else {
			System.out.println("chua tao folder moi");
		}
		
	
	}
}
