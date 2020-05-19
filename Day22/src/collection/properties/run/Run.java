package collection.properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Run {

	public static void main(String[] args) {

		// properties
		// Hashtable�� ��ӹް� �ִ�.
		// key�� value�� ��� String�� Mapó�� ����� �� �ִ�.
		// ���׷�<>�� �ʿ� ����.
		// ���� ������� �����Ѵ�.

		Properties prop = new Properties();
		prop.setProperty("Date", "20200122");
		prop.setProperty("Day", "Wed");
		prop.setProperty("Time", "17:06");
		prop.setProperty("Time", "18:06"); // Map�� ���� ���� ���� ��������.
		System.out.println(prop);

		Set st = prop.keySet();
		Iterator it = st.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key);
			System.out.println(prop.get(key));
		}
		System.out.println("=====properties ���� �� �ҷ�����=====");

		try {
			// �Ϲ� ���� ����
			prop.store(new FileOutputStream("prop.proper"), "comment");

			// XML : Extensible Markup Language
			// Markup Language : �����͸� �����ϰ� �����ϱ� ���� ����ȭ�� ���
			// Ȯ�尡���� ��ũ�� ��� : xml�� ������ �±װ� ����.
			prop.storeToXML(new FileOutputStream("prop.xml"), "comment");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
