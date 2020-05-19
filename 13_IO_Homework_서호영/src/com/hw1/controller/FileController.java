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

		// �����Ͽ� ������ ������ �Է��Ͻÿ�(\"exit\"�� �Է��ϸ� ���� �Է� ��) :��

		System.out.println("���Ͽ� ������ ������ �Է��Ͻÿ�(\"exit\" �� �Է��ϸ� ���� �Է� ��) : ");
		// ���� Scanner�� �Է� �޾� StringBuilder�� �����ϰ�, ��exit���� �Է� ������ ����
		// ������ while�� ����

		String str = sc.nextLine();
		while (!str.equals("exit")) {
			sb.append(str);
			sb.append("\n");
			str = sc.nextLine();
		}
		// �������Ͻðڽ��ϱ�? (y/n)��
		System.out.println("�����Ͻðڽ��ϱ�?(y/n)");
		char input = sc.next().charAt(0);
		sc.nextLine();
		// �Է� ���� ���� �빮���̵� �ҹ����̵� ������� ��y���̸�,
		if (input == 'y' || input == 'Y') {
			System.out.println("���ϸ��� �Է��ϼ���.");
			String fileN = sc.nextLine();

			try {
				bw = new BufferedWriter(new FileWriter(fileN + ".txt"));
				bw.write(sb.toString().toCharArray());
				bw.flush();
				System.out.println(fileN + ".txt ���Ͽ� ���������� �����Ͽ����ϴ�.");

			} catch (IOException e) {

				e.printStackTrace();
			}
		} else {
			System.out.println("�ٽ� �޴��� ���ư��ϴ�.");
		}
		// ���Է¹��� ���ϸ�.txt���� ����ǰ�
		// BufferedWriter�� FileWriter ��Ʈ�� ���
		// ���Է¹��� ���ϸ�.txt ���Ͽ� ���������� �����Ͽ����ϴ�.��

		// �Է� ���� ���� y�� �ƴ� � ���̵� ���ٽ� �޴��� ���ư��ϴ�.�� ��°� �޼ҵ�
		// ����
	}

	public void fileOpen() {

		System.out.println("���� �� ���ϸ� : ");
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

//		// �� �ڵ�
//		System.out.println("���� �� ���ϸ� : ");
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
//				System.out.println("���Ͽ� �߰��� ������ �Է��Ͻÿ�(\\\"exit\\\" �� �Է��ϸ� ���� �Է� ��) : ");
//				String add = sc.nextLine();
//
//				while (!add.equals("exit")) {
//					sb.append(add);
//					sb.append("\n");
//					add = sc.nextLine();
//				}
//
//				System.out.println("����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�?(y/n)");
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
//					System.out.println(fileN + ".txt ���Ͽ� ���������� �����Ͽ����ϴ�.");
//
//				} else {
//					System.out.println("�ٽ� �޴��� ���ư��ϴ�.");
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

		// ��â�ڵ�
		System.out.println("������ ���ϸ��� �Է��ϼ��� : ");
		String fileName = sc.nextLine();
		try {
			br = new BufferedReader(new FileReader(fileName + ".txt"));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println("���Ͽ� �߰��� ������ �Է��Ͻÿ� (\"exit\"�� �Է��ϸ� ���� �Է� ��) : ");

			String type = sc.nextLine();
			while (!type.equals("exit")) {
				sb.append(type);
				sb.append('\n');
				type = sc.nextLine();
			}
			String body = sb.toString();
			System.out.println("����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�? (y/n)");
			char input = sc.next().charAt(0);
			sc.nextLine();
			if (input == 'y' || input == 'Y') {
				bw = new BufferedWriter(new FileWriter(fileName + ".txt", true));
				bw.write(body.toCharArray());
				bw.flush();
				System.out.println(fileName + ".txt ������ ������ ����Ǿ����ϴ�.");
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("������� �ʰ�, �޴��� ���ư��ϴ�.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
