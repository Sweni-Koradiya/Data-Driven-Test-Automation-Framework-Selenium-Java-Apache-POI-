package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {

		// create new file
		File f = new File("C:\\testing\\temp.txt");
		f.createNewFile();

		// write in text file
		FileWriter fw = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(fw);
		out.write("This is first line");
		out.newLine();
		out.write("This is second line");
		out.newLine();
		out.write("This is third line");
		out.newLine();
		f.list();
		out.flush();
		out.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader rd = new BufferedReader(fr);
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
		String x;
		int i=0;
		while ((x = rd.readLine()) != null) {
		    System.out.println(x);
		    i++;
		}
		System.out.println("Total Number of lines: "+i);
}

}
