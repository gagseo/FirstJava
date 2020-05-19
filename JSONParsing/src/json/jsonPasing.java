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

		// JSON : �����͸� ��� ����� 2������ ������.
		// Object / Array
		// 1) Object : {} {}�ȿ� key, value�������� �������ݴϴ�.
		// key, value���� property, key�� property name
		// property name�� String(���ڿ�)���θ� ���� �� �ִ�.
		// �Ľ̰���� Map�� ����.
		// 2) Array : [] []�ȿ� ������ �������ش�.

		// �� : ���ڿ�, ����, boolean, Object, Array

		Gson gson = new Gson(); // Or use new GsonBuilder().create();
		FileReader fr = null;
		try {
			fr = new FileReader("jsonTest.json");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Gson.fromJson : json������ �ڹٷ� �Ľ����ش�.
		// fromJson(Json, ���ϴ� Ŭ����);
		// Json������ �����͸� ù��° �Ű������� �ѱ��
		// �ι�° �Ű��������� ������ Ƽ������ ��ȯ���ش�.
		// toJson : �Ű������� �����͸� �ѱ�� Json�������� �Ľ����ش�.
		Map<String, Object> target2 = gson.fromJson(fr, Map.class);

		System.out.println(target2.get("DESCRIPTION"));
		System.out.println(((Map<String, Object>) target2.get("DESCRIPTION")).get("AUTHOR"));

		Map<String, Object> res = ((List<Map<String, Object>>) target2.get("DATA")).get(0);

		List<Map<String, Object>> toJsonList = (List<Map<String, Object>>) target2.get("DATA");
		
		
		List<Map> jsonListFinal = new ArrayList<>();
		for (Map mres : toJsonList) {
			System.out.println("�۰� : " + mres.get("author"));
			System.out.println("å���� : " + mres.get("title"));
			System.out.println("����Ƚ�� : " + mres.get("cnt"));
			
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
