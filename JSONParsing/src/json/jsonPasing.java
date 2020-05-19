package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class jsonPasing {

	public static void main(String[] args) {

		// JSON : 데이터를 담는 방식이 2가지로 나뉜다.
		// Object / Array
		// 1) Object : {} {}안에 key, value형식으로 나열해줍니다.
		// key, value쌍을 property, key는 property name
		// property name은 String(문자열)으로만 담을 수 있다.
		// 파싱결과가 Map에 담긴다.
		// 2) Array : [] []안에 값들을 나열해준다.

		// 값 : 문자열, 숫자, boolean, Object, Array

		Gson gson = new Gson(); // Or use new GsonBuilder().create();
		FileReader fr = null;
		try {
			fr = new FileReader("jsonTest.json");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Gson.fromJson : json형식을 자바로 파싱해준다.
		// fromJson(Json, 원하는 클래스);
		// Json형식의 데이터를 첫번째 매개변수로 넘기면
		// 두번째 매개변수에서 지정한 티입으로 반환해준다.
		// toJson : 매개변수로 데이터를 넘기면 Json형식으로 파싱해준다.
		Map<String, Object> target2 = gson.fromJson(fr, Map.class);

		System.out.println(target2.get("DESCRIPTION"));
		System.out.println(((Map<String, Object>) target2.get("DESCRIPTION")).get("AUTHOR"));

		Map<String, Object> res = ((List<Map<String, Object>>) target2.get("DATA")).get(0);

		List<Map<String, Object>> toJsonList = (List<Map<String, Object>>) target2.get("DATA");
		
		
		List<Map> jsonListFinal = new ArrayList<>();
		for (Map mres : toJsonList) {
			System.out.println("작가 : " + mres.get("author"));
			System.out.println("책제목 : " + mres.get("title"));
			System.out.println("대출횟수 : " + mres.get("cnt"));
			
			Map<String, Object> toJsonMap = new HashMap<>();
			toJsonMap.put("author", mres.get("author"));
			toJsonMap.put("title", mres.get("title"));
			toJsonMap.put("cnt", mres.get("cnt"));
			jsonListFinal.add(toJsonMap);
			
		}
		
		FileWriter fw = null;
		String Jsonres = gson.toJson(jsonListFinal);
		try {
			
			fw = new FileWriter("final.json");
			fw.write(Jsonres);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
//		for (String key : res.keySet()) {
//			System.out.println(res.get(key));
//		}
//		
//		System.out.println(res.get("author"));

		
		
	}

}
