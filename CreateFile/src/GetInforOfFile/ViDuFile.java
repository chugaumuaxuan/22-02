package GetInforOfFile;

import java.io.File;

public class ViDuFile {
	File file;
	
	ViDuFile(){}
	
	public ViDuFile(String filename) {
		this.file = new File(filename);
	}
	
	public boolean KiemTraThucThi() {
		return this.file.canExecute();
	}
	
	public boolean KiemTraDoc() {
		return this.file.canRead();
	}
	
	public boolean KiemTraGhi() {
		return this.file.canWrite();
	}
	
	public void InDuongDan() {
		System.out.println("Duong dan: " + file.getAbsolutePath());
	}
	
	public void InTen() {
		System.out.println("Ten file: " + file.getName());
	}
	
	public void KiemTraLaFolderHayFile() {
		if(this.file.isDirectory()) {
			System.out.println("day la thu muc");
		}else if(this.file.isFile()){
			System.out.println("day la tap tin");
		}
	}
	
	public void InDanhSachFileCon() {
		if(this.file.isDirectory()) {
			System.out.println("Cac tap tin con, thu muc con la: ");
			File[] mangcon = this.file.listFiles();
			for(File file: mangcon) {
				System.out.println(file.getAbsolutePath());
			}
		}else if(this.file.isFile()) {
			System.out.println("Day la tap tin, khong co du lieu ben trong");
		}
	}
	
	public static void main(String[] args) {
		
		String tenFile = "C:/Users/thang.doan/desktop/FileWriter.txt";
		
		ViDuFile vd = new ViDuFile(tenFile);
			
		vd.KiemTraThucThi();
		vd.KiemTraDoc();
		vd.KiemTraGhi();
		vd.KiemTraLaFolderHayFile();
		vd.InDanhSachFileCon();
		
	}
	
}
