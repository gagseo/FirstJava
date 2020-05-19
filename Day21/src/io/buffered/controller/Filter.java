package io.buffered.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Filter {

	// BufferedInputStream
	// BufferedOutPutStream

	public void buf() {

		// in �� InputStream�̴�.
		// Scanner sc = new Scanner(System.in);

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		FileOutputStream fos = null;

		// 8192byte

		try {
			bis = new BufferedInputStream(System.in);
			fos = new FileOutputStream("buffTest.txt");
			bos = new BufferedOutputStream(fos, 4);

			int check = 0;

			while (bis.available() != 2) { // ����Ű�� \r\n�̱� ������ 2�� ��Ƶ� // while�� �ȿ�(check = bis.read()) != -1
				// System.out.print(check);
				// System.out.print((char) check);
				check = bis.read();
				bos.write(check);
				// bos.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// writer�� reader�� 2����Ʈ ������ �����͸� �ְ�޴� ���ڸ� ���� �����Ŭ�������ٸ�
	// DataInput, DataOutput�� �⺻�����͸� ���� ����� Ŭ�����̴�.
	// ������ �ڷ��� ���� ó���ϴ� ����� �߰����ش�.
	public void data() {

		try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("member.txt"));
				DataInputStream din = new DataInputStream(new FileInputStream("member.txt"))) {

			dout.writeUTF("ȫ�浿");
			dout.writeChar('��');
			dout.writeInt(32);

			dout.writeUTF("������");
			dout.writeChar('��');
			dout.writeInt(21);

			while (din.available() != 0) {
				System.out.println(din.readUTF() + ", " + din.readChar() + ", " + din.readInt());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
