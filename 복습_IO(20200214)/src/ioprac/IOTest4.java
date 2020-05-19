package ioprac;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest4 {

	public static void main(String[] args) {

		fileSys();

	}

	public static void fileSys() {

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int res = 0;

		try {
			bis = new BufferedInputStream(new FileInputStream("C:\\nike.png"));
			bos = new BufferedOutputStream(new FileOutputStream("nike.png"));

			while ((res = bis.read()) != -1) {
				bos.write(res);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
}
