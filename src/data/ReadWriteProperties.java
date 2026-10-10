package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("C:\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		String a = prop.getProperty("Browser");
		System.out.println(a);
		prop.setProperty("Testing Type", "Automation");
		System.out.println(prop.getProperty("Testing Type"));
		prop.setProperty("testing tool","selenium");
		System.out.println(prop.getProperty("testing tool"));
		FileOutputStream fo = new FileOutputStream("C:\\testing\\prop.properties");
		prop.store(fo, "adding to properties file");
	}

}
