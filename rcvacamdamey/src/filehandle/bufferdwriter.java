package filehandle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferdwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	File fi=new File("./samplefile.txt");
		String et=new String();
	FileReader fr=new FileReader(fi);
	BufferedReader br=new BufferedReader(fr);
	String line=new String();
	
		while((line=br.readLine())!=null)
			{
			et += line+"\n";
			}
		System.out.println(et);
		String s="How are you2";
		BufferedWriter bw=new BufferedWriter(new FileWriter(fi));
		bw.write(et + s);
		
		br.close();
		fr.close();
		bw.flush();
		bw.close();
		
		
		

	}

}
