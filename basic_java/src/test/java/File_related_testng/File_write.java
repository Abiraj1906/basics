package File_related_testng;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class File_write {

	@Test
	public void file_write() throws IOException {
		File f=new File("/home/sellerp26/Abirajsellermania/commands/sample");
		FileWriter fw=new FileWriter(f,false);
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("I am Abiraj friend with friend");
		bw.newLine();
		bw.write("I am learning Automation");
		bw.write("overwrite it or not");
		bw.flush();
		bw.close();
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		File_write fw=new File_write();
		fw.file_write();
	}

}
