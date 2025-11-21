package filehandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class bufferreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	File fi=new File("./samplefile.txt");
		
		fi.createNewFile();
		FileReader fr=new FileReader(fi);
		BufferedReader br=new BufferedReader(fr);
		String line=new String();
		
		while((line=br.readLine())!=null)
			{
			System.out.println(line);
			}
		
		br.close();
		fr.close();
		
		
		

	}

}
