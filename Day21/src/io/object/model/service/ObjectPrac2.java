package io.object.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.object.model.vo.Phone;
import io.object.model.vo.Student;
import io.object.model.vo.Teacher;

public class ObjectPrac2 {

	public void objectPrac2() {

		List<Phone> ph = new ArrayList<Phone>();
		ph.add(new Phone("�Ｚ", 70));
		ph.add(new Phone("����", 65));
		ph.add(new Phone("ȭ����", 40));

		List<Student> st = new ArrayList<Student>();
		st.add(new Student("��ȣ��", 18, 'M', ph.get(0)));
		st.add(new Student("������", 18, 'M', ph.get(1)));
		st.add(new Student("�ս���", 18, 'M', ph.get(2)));
		List<Teacher> tc = new ArrayList<Teacher>();
		tc.add(new Teacher("U", "�ϸ�"));

		Map<String, Object> commandMap = new HashMap<String, Object>();
		commandMap.put("phoneDate", ph);
		commandMap.put("Student", st);
		commandMap.put("Teacher", tc);

		// try with resource��
		// �ڵ����� closeó���� ���ش�.
		// .dat Ȯ���ڴ� �����������̶�� �ǹ̸� ���Ѵ�.
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {

			oos.writeObject(commandMap);
			Map res = (Map) ois.readObject();

			System.out.println("�л���ü�� ������ ����ʹ�~!");
			List<Student> studentsData = (List<Student>) res.get("Student");
			for (Student s : studentsData) {
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
