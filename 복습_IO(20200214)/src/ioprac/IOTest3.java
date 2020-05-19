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

		// listFile() : ������ �Ű������� �־��� ��� �Ʒ��� �ִ� ������ ������ ������ ��� �´�.

		for (File f : fi.listFiles()) {
			if (f.isDirectory()) {
				dir_cnt++;
				System.out.println("dir : " + f);
			} else {
				file_cnt++;
				System.out.println("file : " + f);
			}
		}
		System.out.println("������ ���� : " + dir_cnt +"��");
		System.out.println("������ ���� : " + file_cnt + "��");
	}
	

}
