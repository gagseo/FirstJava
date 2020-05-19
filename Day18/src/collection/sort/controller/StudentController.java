package collection.sort.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import collection.sort.comparator.AscName;
import collection.sort.model.vo.Student;

public class StudentController {

	public void testSort() {

		List<Student> sl = new ArrayList<>();
		sl.add(new Student("¹Ú¿µÈñ", 80));
		sl.add(new Student("±è¿µÈñ", 100));
		sl.add(new Student("ÇÑ¿µÈñ", 90));

		System.out.println("===========================================");
		for (Student s : sl) {
			System.out.println(s);
		}

		System.out.println("==============sort : point===================");
		Collections.sort(sl);
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}

		System.out.println("==============sort : Name===================");
		sl.sort(new AscName());
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}

		sl.sort(new Comparator<Student>() { // Å¬·¡½º¿¡ ÀÏÈ¸¼ºÀ¸·Î »ç¿ë

			@Override
			public int compare(Student o1, Student o2) {

				return o1.getName().compareTo(o2.getName());

			}

		});

		System.out.println("==============================");
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}
	}
}
