package run;

import inherititance.inheritance.view.AfterTest;
import inherititance.inheritance.view.BeforeTest;
import inherititance.override.view.OverrideTest;
import poly.Person;
import poly.Teacher;
import poly.electronic.controller.YoogSan;
import poly.electronic.model.vo.Desktop;
import poly.electronic.model.vo.Electronic;
import poly.electronic.model.vo.NoteBook;
import poly.electronic.model.vo.Tablet;
import poly.view.PolyTest;
//import tour.view.MainMenu;
import tour_teacher.veiw.MainMenu;

public class Run {

	public static void main(String[] args) {

		// // BeforeTest class�� run
		// BeforeTest bt = new BeforeTest();
		// bt.beforeTest();

		// // AfterTest class�� run
		// AfterTest at = new AfterTest();
		// at.afterTest();

		// // OverrideTest class�� run
		// OverrideTest ot = new OverrideTest();
		// ot.overrideTest();

		// // ������ ����
		// // Person class���� ��ӵ� Teacher class�� run
		// Teacher t = new Teacher();
		// Person p = t;

		// // PolyTest class�� run
		// PolyTest pt = new PolyTest();
		// pt.polyTest();

		// 1. YoogSan class�� run
		// YoogSan ys = new YoogSan();
		// YoogSan class �ּ�ǥ���Ѱ�
		// ys.insert(new Desktop("�Ｚ", "��ǻ��", 1200000, "Geforce"));
		// ys.insert(new NoteBook("LG", "�׷�", 1500000, 3));
		// ys.insert(new Tablet("����", "����", 2500000, true));
		// System.out.println(ys.selectDesk());
		// System.out.println(ys.selectNoteBook());
		// System.out.println(ys.selectTablet());

		// // 2. YoogSan class�� run
		// YoogSan ys = new YoogSan();
		// Desktop dt = new Desktop("�Ｚ", "��ǻ��", 1200000, "Geforce");
		// NoteBook note = new NoteBook("LG", "�׷�", 1500000, 3);
		// Tablet tab = new Tablet("����", "����", 2500000, true);
		// ys.insert(dt);
		// ys.insert(note);
		// ys.insert(tab);
		//
		// Electronic[] elec = ys.select();
		// for (int i = 0; i < elec.length; i++) {
		//
		// if (elec[i] == null) {
		// break;
		// } else {
		// System.out.println(elec[i]);
		// }
		// }
		//

		// // MainMenu class�� run (tour ��Ű��)
		// MainMenu mm = new MainMenu();
		// mm.mainMeun();

		// MainMenu class�� run (tour_teacher ��Ű��)
		MainMenu mm = new MainMenu();
		mm.mainMenu();
		
	}

}
