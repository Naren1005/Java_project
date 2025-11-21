package filehandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class propetyfile {

	public static void main(String[] args) throws IOException {
		
		File fi=new File("dbcon.properties");
		
		fi.createNewFile();
		System.out.println(fi.exists());
		Properties pro=new Properties();
//		pro.setProperty("url","naren.com");
//		pro.setProperty("username","naren");
//		pro.setProperty("password","naren123");
//		FileOutputStream fos=new FileOutputStream(fi);
//		pro.store(fos, "added the db detail 20.36+5");
		
		
		FileInputStream fis=new FileInputStream(fi);
		pro.load(fis);
		System.out.println(pro.getProperty("uerl","value is not there"));
		
		System.out.println(pro);
		
		

	}

}
