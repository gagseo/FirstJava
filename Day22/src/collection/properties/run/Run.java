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
		// Hashtable을 상속받고 있다.
		// key와 value가 모두 String인 Map처럼 사용할 수 있다.
		// 제네렉<>이 필요 없다.
		// 파일 입출력을 지원한다.

		Properties prop = new Properties();
		prop.setProperty("Date", "20200122");
		prop.setProperty("Day", "Wed");
		prop.setProperty("Time", "17:06");
		prop.setProperty("Time", "18:06"); // Map과 같이 값이 덮어 씌여진다.
		System.out.println(prop);

		Set st = prop.keySet();
		Iterator it = st.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key);
			System.out.println(prop.get(key));
		}
		System.out.println("=====properties 저장 및 불러오기=====");

		try {
			// 일반 파일 저장
			prop.store(new FileOutputStream("prop.proper"), "comment");

			// XML : Extensible Markup Language
			// Markup Language : 데이터를 저장하고 전달하기 위해 구조화된 언어
			// 확장가능한 마크업 언어 : xml은 정해진 태그가 없다.
			prop.storeToXML(new FileOutputStream("prop.xml"), "comment");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
