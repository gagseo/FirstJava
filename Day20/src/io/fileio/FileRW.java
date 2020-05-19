package io.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileRW {

	public void fInOut() {

		// �ڹ��� ���ڴ� 2����Ʈ�̴� (char)
		// Stream�� ��� �����͸� 1����Ʈ�� �ְ� �ޱ� ������
		// ���ڸ� �ٷ�� ��Ȳ����
		// ��� �ƴ϶�� ������ �߻��� Ȯ���� ����.

		Writer wr = null;
		Reader rd = null;

		// OutputStream : ��½�Ʈ��, �ڹ����α׷� ---> �����͸�����

		try {
			wr = new FileWriter("test.txt");
			String str = "���̿� �ʹ� ����.";
			wr.write(str.toCharArray()); // String�� byte�迭�� ����
			wr.flush(); // ���۸� ����ش�.

			rd = new FileReader("test.txt");
			int check = 0;
			System.out.println(check);
			System.out.println((char) check + "");

			while ((check = rd.read()) != -1) {
				System.out.print((char) check);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				rd.close();
				wr.close(); // �ݵ�� �ݾ�����Ѵ�.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
