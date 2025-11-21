package filehandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class usingscanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fi=new File("./samplefile.txt");
		fi.createNewFile();
		Scanner sc= new  Scanner(fi);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
