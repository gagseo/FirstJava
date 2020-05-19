package properties.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ProController {

	// properties
	// key�� value�� ��� String�� ���̴�.
	// properties
	// setProperty : �Է½�
	// getProperty : �����ö�
	// store() / storeToXML() : ���Ϸ� ����
	// load() / loadFromXML() : ���Ͽ��� ������ ��������

	public void prop01() {

		Properties prop = new Properties();
		System.out.println("==========setProperty========");
		prop.setProperty("Date", "2020-02-13");
		prop.setProperty("Dat", "Friday");
		prop.setProperty("Time", "18:14");
		prop.setProperty("Time", "14:18");
		System.out.println(prop);

		System.out.println("==========Ű������ ����ϱ�=========");
		System.out.println(prop.getProperty("Date"));

		System.out.println("==========�ϰ� ���============");
		Set<String> st = prop.stringPropertyNames();
		for (String key : st) {
			System.out.println(prop.getProperty(key));
		}

	}

	// XML ���Ϸ� �����͸� ����� �� �ִ�.
	// xml : Ȯ�� ������ ��ũ�� ���
	// ��ũ����� : �����͸� �����ϱ� ���ؼ� ������ �� ���
	// HTML : ��ũ�����
	public void prop02() {

		Properties prop = new Properties();
		prop.setProperty("Date", "2020-02-14");
		prop.setProperty("Dat", "Friday");
		prop.setProperty("Time", "19:06");

		// ���������ϱ�
		// store() / storeToXML()

		try {
			prop.store(new FileOutputStream("prop.properties"), "cmt");
			prop.storeToXML(new FileOutputStream("prop.xml"), "cmt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ���Ϻҷ�����
		// load() / loadFromXML()
		Properties readProp = new Properties();

		try {
			readProp.load(new FileInputStream("prop.properties"));
			System.out.println("Ű�� �� ��������");
			System.out.println(readProp.getProperty("Date"));
			System.out.println();
			System.out.println("�ϰ�����غ���");
			Set<String> st = readProp.stringPropertyNames();
			for (String key : st) {
				System.out.println(prop.getProperty(key));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
