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

		// in 은 InputStream이다.
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

			while (bis.available() != 2) { // 엔터키는 \r\n이기 때문에 2로 잡아둠 // while문 안에(check = bis.read()) != -1
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

	// writer와 reader가 2바이트 단위로 데이터를 주고받는 문자를 위한 입출력클래스였다면
	// DataInput, DataOutput은 기본데이터를 위한 입출력 클래스이다.
	// 데이터 자료형 별로 처리하는 기능을 추가해준다.
	public void data() {

		try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("member.txt"));
				DataInputStream din = new DataInputStream(new FileInputStream("member.txt"))) {

			dout.writeUTF("홍길동");
			dout.writeChar('남');
			dout.writeInt(32);

			dout.writeUTF("유관순");
			dout.writeChar('여');
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
