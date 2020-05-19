package io.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilePrac {

	// 1. 입출력 : 외부자원(키보드, 파일, 데이터베이스 서버, 네트워크상 다른 PC등등)
	// 자바 프로그램 혹은 메모리로 데이터를 읽어오거나(입력) 반대로 외부자원으로 쓰기를 하는것(출력)

	// 2. Stream : 데이터를 입출력 하기 위해 여는 통로/
	// Stream은 기본적으로 단 방향이다.
	// 먼저 들어간 데이터가 먼저 나온다(FIFO)
	// 반드시 close()메서드를 호출해 통로를 닫아줘야 한다!!!!

	// 3. 스트림의 종류
	// 분류 :
	// 바이트 스트림, 문자 스트림
	// 기반 스트림, 보조스트림
	// 1)기반 스트림: 어떤 대상과 데이터를 입출력할지 정해주는 스트림클래스
	// FileInputStream/FileOutputStream : 파일 입출력 스트림
	// ByteArrayInputStream/ByteArrayOutputStream : 바이트배열 입출력 스트림
	// PipedInputStream/PipedOutputStream : 쓰레드간 데이터 주고 받을 때 사용하는 스트림
	// StringBufferInputStream/StringBufferOutputStream :
	// 문자열을 바이트로 읽어들이고 쓰는 스트림을 생성한다.

	// 2)보조 스트림: 기반 스트림의 성능을 보완하는 클래스(속도, 기능추가, 변환작업 등등)
	// 필터스트림을 상속받아서 필터스트림이라고 부르기도 한다.
	// (1) BufferedInputStream/BufferedOutputStream
	// 버퍼에 데이터를 모아 한꺼번에 작업을 하여 실행성능을 향상시켜준다.
	// (2) ObjectInputStream/ObjectOutputStream
	// 객체를 파일 또는 네트워크와 입출력할 수 있도록 도와준다.
	// 단 반드시 직렬화 처리를 해야한다.
	// (3) DataInputStream/DataOutputStream
	// 기본 자료형 데이터를 읽고 쓰기가 가능하도록 기능을 제공한다.
	// (4) InputStreamReader/InputStreamWriter
	// 소스스트림이 바이트 기반 스트림이지만, 데이터가 문자일 경우
	// 문자단위(2byte)로 입출력을 하게끔 해준다.

	public void fMethods() {

		// 자바에서 특수기호를 처리하는 방법
		// \ 를 써주면 된다.
		// 번외편
		// \t : 텝
		// \n(아스키코드10) : 줄바꿈
		// \r(아스키코드13) : 줄바꿈 ver2 : 줄의 제일 처음으로 커서를 이동

		// System.out.println("\"히히히 따라해보시지요\"");

		// File Class 메서드
		// 경로, 파일 생성해주는 메서드
		// 1. createNewFile() : File객체의 생성자 매개변수로 받은 경로와 파일명을
		// 사용해 파일을 만들어준다.
		// 2. mkdirs : File 객체의 생성자 매개변수로 받은 경로의 폴더를 만들어 준다.
		// mkdir

		// 작업하는 자바프로젝트에 파일 생성(경로를 작성하지 않음)
		File f = new File("test.txt");
		try {
			f.createNewFile();

			// 기존에 존재하는 경로에 파일 생성하기.
			f = new File("AAA\\bbb\\ccc");
			// f.createNewFile();

			// 경로에 폴더 만들어 주기
			f.mkdirs(); // 중간 경로의 폴더도 한번에 생성 해준다.
			// f.mkdir(); //중간 경로의 폴더가 존재하지 않으면 폴더를 만들지 않는다.

			f = new File("AAA\\bbb\\ccc");
			f.createNewFile();

			// ./ 현재위치
			// 현재위치
			// ../ 부모위치

			// 해당 폴더나 파일이 존재하는지
			System.out.println(f.exists());
			if (!f.exists()) {  // 경로가 존재하지 않는다면
				f.mkdirs(); // 경로를 만들었다
			}

			String fileName = "AGB.txt";
			String fileRes = f.getPath() + "\\" + fileName;
			f = new File(fileRes);
			f.createNewFile();

			// 그외 메서드
			System.out.println("파일명 : " + f.getName());
			System.out.println("저장 상대경로 : " + f.getPath());
			System.out.println("저장 절대경로 : " + f.getAbsolutePath());
			System.out.println("상위 폴더 : " + f.getParent());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void fInOut() {

		OutputStream os = null;
		InputStream is = null;

		// OutputStream : 출력스트림, 자바프로그램 ---> 데이터목적지

		try {
			os = new FileOutputStream("test.txt");
			String str = "아이오 너무 쉽다."; // 한글은 256의 범위를 넘어간다. FileRW class 확인
			os.write(str.getBytes()); // String을 byte배열로 변경

			is = new FileInputStream("test.txt");
			int check = is.read(); //데이터를 읽어오는 메소드 - 1byte씩 읽어온다.
			System.out.println(check);
			System.out.println((char) check + "");

			while ((check = is.read()) != -1) {
				System.out.println((char) check);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close(); // 반드시 닫아줘야한다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
