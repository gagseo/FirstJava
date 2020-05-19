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
				System.out.println("=====다음의 성적들을 입력하시오=====");
				System.out.println("국어 : ");
				int kor = sc.nextInt();
				sc.nextLine();
				System.out.println("영어 : ");
				int eng = sc.nextInt();
				sc.nextLine();
				System.out.println("수학 : ");
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
				System.out.println(num + "번째 학생 정보 기록");

				boolean b = true;
				while (b) {
					sc.nextLine();
					System.out.println("계속 저장 하시겠습니까?(y/n)");
					char menu = sc.nextLine().charAt(0);

					switch (menu) {
					case 'y':
						b = false;
						break;
					case 'n':
						System.out.println("score.dat 파일에 저장 완료!");
						dos.close();
						b = false;
						b = false;
						break;
					default:
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
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
		// 몇명의 학생인지 or 반복문이 실행된 횟수(둘 다 같은 개념)

		try (FileInputStream fis = new FileInputStream("score.dat"); DataInputStream dis = new DataInputStream(fis)) {
			while (true) {

				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				sum = dis.readInt();
				avg = dis.readDouble();

				count++;

				System.out.println(count + "번째 학생");
				System.out.println("국   영   수   총점   평균");
				System.out.println(kor + " " + eng + " " + mat + " " + sum + " " + avg);

				sumS += sum;
				avgS += avg;
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (EOFException e) {

			sumS = sumS / count;
			avgS = avgS / count;
			System.out.println("읽은 횟수        전체 총점 평균         전체 평균");
			System.out.println("   " + count + "       " + sumS + "          " + avgS);
			System.out.println("score.dat 파일 읽기 완료!");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
