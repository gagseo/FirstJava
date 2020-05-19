package ioprac;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest2 {

	public static void main(String[] args) {

		File fi = new File("test.txt");

		myOutput(fi);
		myInput(fi);

	}

	// FileWriter / FileReader
	private static void myOutput(File fi) {

		try {
			FileWriter fw = new FileWriter(fi);
			fw.write("연습중입니다.\n");
			fw.append("abc\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void myInput(File fi) {

		FileReader fr = null;

		int ch;
		try {
			fr = new FileReader(fi);
			
			while ((ch = fr.read()) != -1) {
				
				System.out.print((char) ch);
			}
			
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
