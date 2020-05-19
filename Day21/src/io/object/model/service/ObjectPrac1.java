package io.object.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import io.object.model.vo.Phone;
import io.object.model.vo.Student;
import io.object.model.vo.Teacher;

public class ObjectPrac1 {

	// writeObject() : 객체를 파일에 쓰기

	// readObject() : 객체를 파일에서 읽어오기
	// readObject는 Object타입으로 반환하기 때문에 형변환이 필요하다.
	// 객체를 Stream을 사용해서 외부자원과 주고받기 위해서는
	// 객체를 바이트단위로 분해하는 직렬화 과정을 거쳐야 한다.
	// Serializable인터페이스를 클래스에 구현하면
	// 해당 클래스는 직렬화 가능한 클래스가 된다.

	public void objectPrac1() {

		Phone[] ph = { new Phone("삼성", 70), new Phone("엘지", 65), new Phone("화웨이", 40) };

		Student[] st = { new Student("학생1", 18, 'M', ph[0]), new Student("학생2", 18, 'W', ph[1]),
				new Student("학생3", 18, 'M', ph[2]) };

		Teacher tc = new Teacher("U", "하명도");

		// try with resource문
		// 자동으로 close처리를 해준다.
		// .dat 확장자는 데이터파일이라는 의미를 지닌다.
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {

			for (int i = 0; i < ph.length; i++) {
				oos.writeObject(ph[i]);
			}
			for (int i = 0; i < st.length; i++) {
				oos.writeObject(st[i]);
			}
			oos.writeObject(tc);

			System.out.println((Student) ois.readObject());

			// 파일로부터 입력받는 코드작성
			for (int i = 0; i < ph.length; i++) {
				System.out.println((Phone) ois.readObject()); // 다운케스팅해야하는 이유는 ois가 Object타입이기 때문에
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
