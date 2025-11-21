package filehandle;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class filereader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fi=new File("./samle2.txt");
		fi.createNewFile();
		FileReader fr=new FileReader(fi);
		int asc;
		while((asc=fr.read())!=-1)
		{
		System.out.print((char)asc);
		}
		fr.close();
	}
}
