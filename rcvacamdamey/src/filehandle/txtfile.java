package filehandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class txtfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File fi=new File("./samplefile.txt");
		
		fi.createNewFile();
		FileInputStream fis=new FileInputStream(fi);
		int asc;
		while((asc= fis.read())!=-1)
		{
		System.out.print((char)asc);
		}
		fis.close();

	}

}
