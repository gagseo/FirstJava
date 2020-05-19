package io.fileTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

	public void fileTest() {

		try {
			FileInputStream fis = new FileInputStream("C:\\IOTest\\fa");
			FileOutputStream fos = new FileOutputStream("나이키.png");

			int check;
			while ((check = fis.read()) != -1) { // read() 메소드로 반복
				fos.write(check);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
