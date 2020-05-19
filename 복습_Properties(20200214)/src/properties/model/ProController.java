package properties.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ProController {

	// properties
	// key와 value가 모두 String인 맵이다.
	// properties
	// setProperty : 입력시
	// getProperty : 꺼내올때
	// store() / storeToXML() : 파일로 저장
	// load() / loadFromXML() : 파일에서 데이터 꺼내오기

	public void prop01() {

		Properties prop = new Properties();
		System.out.println("==========setProperty========");
		prop.setProperty("Date", "2020-02-13");
		prop.setProperty("Dat", "Friday");
		prop.setProperty("Time", "18:14");
		prop.setProperty("Time", "14:18");
		System.out.println(prop);

		System.out.println("==========키값으로 출력하기=========");
		System.out.println(prop.getProperty("Date"));

		System.out.println("==========일괄 출력============");
		Set<String> st = prop.stringPropertyNames();
		for (String key : st) {
			System.out.println(prop.getProperty(key));
		}

	}

	// XML 파일로 테이터를 출력할 수 있다.
	// xml : 확장 가능한 마크업 언어
	// 마크업언어 : 테이터를 전달하기 위해서 디자인 된 언어
	// HTML : 마크업언어
	public void prop02() {

		Properties prop = new Properties();
		prop.setProperty("Date", "2020-02-14");
		prop.setProperty("Dat", "Friday");
		prop.setProperty("Time", "19:06");

		// 파일저장하기
		// store() / storeToXML()

		try {
			prop.store(new FileOutputStream("prop.properties"), "cmt");
			prop.storeToXML(new FileOutputStream("prop.xml"), "cmt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 파일불러오기
		// load() / loadFromXML()
		Properties readProp = new Properties();

		try {
			readProp.load(new FileInputStream("prop.properties"));
			System.out.println("키로 값 가져오기");
			System.out.println(readProp.getProperty("Date"));
			System.out.println();
			System.out.println("일괄출력해보기");
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
