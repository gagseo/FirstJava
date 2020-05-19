package ioprac;

import java.io.File;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {

		// File Class : 경로 설정 및 파일 생성
		// 1. createNewFile() : File객체의 생성자 매개변수로 받은
		// 경로와 파일명을 사용해서 파일을 만들어 준다.

		// 2. mkdirs() : File객체의 생성자 매개변수로 받은 경로의 폴더를 만들어준다.

		// 1. 경로 안 넣고 파일 만들기

		File f = new File("test.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String root = "c:\\test\\";
		
		// 2. 경로를 넣어서 파일생성해보기
		f = new File("c:\\test\\test.txt");
		File f1 = new File("c:\\test");
		// 경로 존재 확인 메서드
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
