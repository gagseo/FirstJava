package com.hw1.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileController {
	Scanner sc = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	BufferedReader br = null;
	BufferedWriter bw = null;

	public FileController() {

	}

	public void fileSave() {

		// “파일에 저장할 내용을 입력하시오(\"exit\"을 입력하면 내용 입력 끝) :”

		System.out.println("파일에 저장할 내용을 입력하시오(\"exit\" 을 입력하면 내용 입력 끝) : ");
		// 값을 Scanner로 입력 받아 StringBuilder에 저장하고, “exit”을 입력 했을시 빠져
		// 나가는 while문 생성

		String str = sc.nextLine();
		while (!str.equals("exit")) {
			sb.append(str);
			sb.append("\n");
			str = sc.nextLine();
		}
		// “저장하시겠습니까? (y/n)”
		System.out.println("저장하시겠습니까?(y/n)");
		char input = sc.next().charAt(0);
		sc.nextLine();
		// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
		if (input == 'y' || input == 'Y') {
			System.out.println("파일명을 입력하세요.");
			String fileN = sc.nextLine();

			try {
				bw = new BufferedWriter(new FileWriter(fileN + ".txt"));
				bw.write(sb.toString().toCharArray());
				bw.flush();
				System.out.println(fileN + ".txt 파일에 성공적으로 저장하였습니다.");

			} catch (IOException e) {

				e.printStackTrace();
			}
		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
		}
		// “입력받은 파일명.txt”로 저장되게
		// BufferedWriter와 FileWriter 스트림 사용
		// “입력받은 파일명.txt 파일에 성공적으로 저장하였습니다.”

		// 입력 받은 값이 y가 아닌 어떤 값이든 “다시 메뉴로 돌아갑니다.” 출력과 메소드
		// 종료
	}

	public void fileOpen() {

		System.out.println("열기 할 파일명 : ");
		String openFileName = sc.nextLine();

		try {
			br = new BufferedReader(new FileReader(openFileName + ".txt"));
			int check = 0;

			try {
				while ((check = br.read()) != -1) {
					System.out.print((char) check);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileEdit() {

//		// 내 코드
//		System.out.println("수정 할 파일명 : ");
//		String fileName = sc.nextLine();
//
//		try {
//
//			br = new BufferedReader(new FileReader(fileName + ".txt"));
//
//			String str = null;
//
//			try {
//
//				while ((str = br.readLine()) != null) {
//					System.out.println(str);
//
//				}
//				System.out.println("파일에 추가할 내용을 입력하시오(\\\"exit\\\" 을 입력하면 내용 입력 끝) : ");
//				String add = sc.nextLine();
//
//				while (!add.equals("exit")) {
//					sb.append(add);
//					sb.append("\n");
//					add = sc.nextLine();
//				}
//
//				System.out.println("변경된 내용을 파일에 추가하시겠습니까?(y/n)");
//				char input = sc.next().charAt(0);
//				sc.nextLine();
//
//				String fileN = "";
//
//				if (input == 'y' || input == 'Y') {
//
//					bw = new BufferedWriter(new FileWriter(fileN + ".txt", true));
//					bw.write(sb.toString().toCharArray());
//					bw.flush();
//					System.out.println(fileN + ".txt 파일에 성공적으로 저장하였습니다.");
//
//				} else {
//					System.out.println("다시 메뉴로 돌아갑니다.");
//				}
//			} catch (IOException e) {
//
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

		// 오창코드
		System.out.println("수정할 파일명을 입력하세요 : ");
		String fileName = sc.nextLine();
		try {
			br = new BufferedReader(new FileReader(fileName + ".txt"));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println("파일에 추가할 내용을 입력하시오 (\"exit\"를 입력하면 내용 입력 끝) : ");

			String type = sc.nextLine();
			while (!type.equals("exit")) {
				sb.append(type);
				sb.append('\n');
				type = sc.nextLine();
			}
			String body = sb.toString();
			System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			char input = sc.next().charAt(0);
			sc.nextLine();
			if (input == 'y' || input == 'Y') {
				bw = new BufferedWriter(new FileWriter(fileName + ".txt", true));
				bw.write(body.toCharArray());
				bw.flush();
				System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("저장되지 않고, 메뉴로 돌아갑니다.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
