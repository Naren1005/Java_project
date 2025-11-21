package filehandle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File fi=new File("./sample4.txt");
		fi.createNewFile();
		String a="Lalitha Varshini";
		
		
		FileWriter fw=new FileWriter(fi);
		
		fw.write(a);
		fw.flush();
		fw.close();
		
		
		
		

	}

}
