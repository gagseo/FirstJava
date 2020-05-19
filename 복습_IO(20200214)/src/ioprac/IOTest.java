package ioprac;

import java.io.File;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {

		// File Class : ��� ���� �� ���� ����
		// 1. createNewFile() : File��ü�� ������ �Ű������� ����
		// ��ο� ���ϸ��� ����ؼ� ������ ����� �ش�.

		// 2. mkdirs() : File��ü�� ������ �Ű������� ���� ����� ������ ������ش�.

		// 1. ��� �� �ְ� ���� �����

		File f = new File("test.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String root = "c:\\test\\";
		
		// 2. ��θ� �־ ���ϻ����غ���
		f = new File("c:\\test\\test.txt");
		File f1 = new File("c:\\test");
		// ��� ���� Ȯ�� �޼���
		if (!f1.exists()) {
			f1.mkdirs();
		}
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File f2 = new File(root,"AA");
		f2.mkdirs();
		f2 = new File(root, "AA.txt");
		
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
