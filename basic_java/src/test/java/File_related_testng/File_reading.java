package File_related_testng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_reading {

	public static void main(String[] args) throws IOException {
		
		
		File file=new File("/home/sellerp26/Abirajsellermania/commands/commands.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
		//br.close();
		
		
		
		
	}

}
