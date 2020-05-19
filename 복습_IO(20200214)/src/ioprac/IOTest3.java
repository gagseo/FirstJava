package ioprac;

import java.io.File;

public class IOTest3 {

	public static void main(String[] args) {

		File fi = new File("c:\\");
		printFileInfo(fi);

	}

	public static void printFileInfo(File fi) {

		int file_cnt = 0;
		int dir_cnt = 0;

		// listFile() : 생성자 매개변수로 넣어준 경로 아래에 있는 폴더와 파일의 정보를 들고 온다.

		for (File f : fi.listFiles()) {
			if (f.isDirectory()) {
				dir_cnt++;
				System.out.println("dir : " + f);
			} else {
				file_cnt++;
				System.out.println("file : " + f);
			}
		}
		System.out.println("폴더의 개수 : " + dir_cnt +"개");
		System.out.println("파일의 개수 : " + file_cnt + "개");
	}
	

}
