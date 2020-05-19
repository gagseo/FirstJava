package com.hw2.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SungjukProcess {

	Scanner sc = new Scanner(System.in);

	public SungjukProcess() {

	}

	public void sungjukSave() {

		int num = 0;

		try (FileOutputStream fos = new FileOutputStream("score.dat");
				DataOutputStream dos = new DataOutputStream(fos)) {

			while (true) {
				System.out.println("=====������ �������� �Է��Ͻÿ�=====");
				System.out.println("���� : ");
				int kor = sc.nextInt();
				sc.nextLine();
				System.out.println("���� : ");
				int eng = sc.nextInt();
				sc.nextLine();
				System.out.println("���� : ");
				int mat = sc.nextInt();
				sc.nextLine();

				int sum = kor + eng + mat;
				double avg = sum / 3.0;

				dos.writeInt(kor);
				dos.writeInt(eng);
				dos.writeInt(mat);
				dos.writeInt(sum);
				dos.writeDouble(avg);
				num++;
				dos.flush();
				System.out.println(num + "��° �л� ���� ���");

				boolean b = true;
				while (b) {
					sc.nextLine();
					System.out.println("��� ���� �Ͻðڽ��ϱ�?(y/n)");
					char menu = sc.nextLine().charAt(0);

					switch (menu) {
					case 'y':
						b = false;
						break;
					case 'n':
						System.out.println("score.dat ���Ͽ� ���� �Ϸ�!");
						dos.close();
						b = false;
						b = false;
						break;
					default:
						System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
						break;
					}
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void scoreRead() {

		int kor = 0, eng = 0, mat = 0, sum = 0, sumS = 0;
		double avg = 0.0, avgS = 0.0;
		int count = 0;
		// ����� �л����� or �ݺ����� ����� Ƚ��(�� �� ���� ����)

		try (FileInputStream fis = new FileInputStream("score.dat"); DataInputStream dis = new DataInputStream(fis)) {
			while (true) {

				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				sum = dis.readInt();
				avg = dis.readDouble();

				count++;

				System.out.println(count + "��° �л�");
				System.out.println("��   ��   ��   ����   ���");
				System.out.println(kor + " " + eng + " " + mat + " " + sum + " " + avg);

				sumS += sum;
				avgS += avg;
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (EOFException e) {

			sumS = sumS / count;
			avgS = avgS / count;
			System.out.println("���� Ƚ��        ��ü ���� ���         ��ü ���");
			System.out.println("   " + count + "       " + sumS + "          " + avgS);
			System.out.println("score.dat ���� �б� �Ϸ�!");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
