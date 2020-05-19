package simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {

		///// List ���� ���� /////
		SimpleList<String> sl = new SimpleList<String>();
		sl.add("A");
		sl.add("B");
		sl.add("C");
		sl.add("D");
		for (Object i : sl) {
			System.out.println(i);
		}

		// for (int i = 0; i < sl.getAll().length; i++) {
		// System.out.println(sl.getAll()[i]);
		// }

		List<String> rs = new ArrayList<String>();
		rs.add("��");
		rs.add("��");
		rs.add("��");
		rs.add("��");

		for (String res : rs) {
			System.out.println(res);
		}

		// Iterator Ȱ���ϱ�
		Iterator it = sl.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		Iterator it2 = rs.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

	}
}
