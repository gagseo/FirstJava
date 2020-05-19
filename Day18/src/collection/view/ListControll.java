package collection.view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import collection.model.vo.Music;

public class ListControll {

	public void doList() {

		// ArrayList
		// 크기 지정 가능, 지정하지 않으면 기본이 10
		List list = new LinkedList();

		list.add(new Music("백지영", "다시는 사랑하지"));
		list.add(new Music("빅뱅", "거짓말"));
		list.add(new Music("트와이스", "TT"));
		list.add("끝");

		// System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// add : 리스트의 끝에 값 추가
		// size : 리스트에 들어간 데이터의 갯수
		// get(int index): 리스트에서 해당 인덱스에 존재하는 객체 반환

		// add(int index, Object e): 인덱스 지정하여 해당 인덱스에 e를 추가
		System.out.println("--------add(int index, Object e)--------");
		list.add(1, new Music("백예린", "square"));
		System.out.println(list.size());
		System.out.println(list);

		// set(int index, Object e): 지정한 인덱스의 값을 e로 변경
		System.out.println("--------set(int index, Object e)--------");
		list.set(1, new Music("아이유", "좋은 날"));
		System.out.println(list.size());
		System.out.println(list);

		// remove(int index) : 리스트에서 해당 인덱스를 지워라
		System.out.println("--------remove(int index)--------");
		list.remove(1);
		System.out.println(list.size());
		System.out.println(list);

		// contains(Object o): o를 포함하고 있는지 true/false를 반환
		System.out.println("--------contains(Object o)--------");
		System.out.println(list.contains(new Music("백지영", "다시는 사랑하지")));
		// 새로운 인스턴스로 불러와 주소값이 달라서 false반환
		// 이후 Music클래스에 equal()로 오버라이딩 하면 true

		// indexOf(Object o): o가 위치한 인덱스를 반환
		System.out.println("--------indexOf(Object o)--------");
		System.out.println(list.indexOf(new Music("백지영", "다시는 사랑하지")));

		// subList(int index1, int index2): index1부터 index2 이전까지 데이터들을 list로 추출하여 리턴
		System.out.println("--------subList(int index1, int index2)--------");
		List sub = list.subList(0, 2);
		System.out.println(sub);

		// isEmpty(): 리스트 안에 값이 있으면 false 없으면 true
		System.out.println("--------isEmpty()--------");
		System.out.println(list.isEmpty());

		// clear(): 리스트 안의 모든 값을 삭제
		System.out.println("--------clear()--------");
		list.clear();
		System.out.println(list.isEmpty());
	}

	public void doList2() {

		// 제네릭
		// 장점 : 1) 명시한 한가지 타입의 객체만 저장하도록 설정함으로써 저장시 다른 타입이
		// 저장됮 못하도록 한다. 안정성이 높다.

		// 2) 컬렉션에 저장된 객체를 꺼내어서 사용할 때 객체의 종류에 따라 타입을 확인하고
		// 형변환 하는 절차를 없앨 수 있다.

		List<Music> list = new ArrayList(1);
		list.add(new Music("백지영", "다시는 사랑하지"));
		list.add(new Music("빅뱅", "거짓말"));
		list.add(new Music("트와이스", "TT"));
		// list.add("끝");

		for (Music m : list) {
			System.out.println(m);
		}
	}
}
