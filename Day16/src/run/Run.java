package run;

import abstract_.model.vo.sports.BasketBall;
import abstract_.model.vo.sports.FootBall;
import abstract_.model.vo.sports.Sports;
import abstract_.view.PolyTest;
import interface_model.vo.Family;
import interface_model.vo.Father;
import interface_model.vo.Playable;
import interface_skillup.jo_project.veiw.MainMenu;
import interface_skillup.model.vo.GalaxyNote9;
import interface_skillup.model.vo.SmartPhone;
import interface_skillup.model.vo.V40;

public class Run {

	public static void main(String[] args) {

		// //PolyTest class�� run
		// PolyTest pt = new PolyTest();
		// pt.polyTest();

		// Sports class�� �������� �����ؼ� run�϶�
		// // ���� �ڵ�
		// BasketBall bb = new BasketBall();
		// FootBall fb = new FootBall();
		// Sports[] sArr = new Sports[2];
		// sArr[0] = bb;
		// sArr[1] = fb;
		// for (int i = 0; i < sArr.length; i++) {
		// sArr[i].rule();
		// }
		// // �� �ڵ�
		// Sports[] s = new Sports[2];
		// s[0] = new BasketBall();
		// s[1] = new FootBall();
		// for (int i = 0; i < s.length; i++) {
		// s[i].rule();
		// }

		// // interface ��Ű��
		// // ���� Ÿ������ �ƹ��� Ŭ���� �ν��Ͻ�ȭ
		// Family father = new Father("ȫ�繫", 70, 15);
		// System.out.println("�ƹ����� �̸� : " + father.getName());
		// // �ƹ��� �ǰ�
		// System.out.println("�ƹ����� �ǰ� : " + father.getHealth());
		// // �ƹ����� �Ļ縦 �Ѵ�.
		// father.eat();
		// // �ƹ��� �ǰ� ���
		// System.out.println("�ƹ����� �ǰ� : " + father.getHealth());
		// // �ƹ����� ���� �ܴ�.
		// father.sleep();
		// // �ƹ��� �ǰ� ���
		// System.out.println("�ƹ����� �ǰ� : " + father.getHealth());
		// // "�ƹ����� �Ʊ�� ����ش�" ���� ���
		// System.out.println("�Ƹ����� �Ʊ�� ����ش�.");
		// // �ƹ��� play�޼��� ȣ��
		// ((Father) father).play(); // Father�� ����ȯ(�ٿ�ĳ����)�� ���ִ���
		// ((Playable) father).play(); // Playable�� �������̽��ؼ� ������ ���-
		// // �ƹ��� �ǰ����
		// System.out.println("�ƹ����� �ǰ� : " + father.getHealth());

		// // interface_skillup ��Ű��
		// GalaxyNote9 gn9 = new GalaxyNote9();
		// V40 v40 = new V40();
		// SmartPhone[] sp = new SmartPhone[2];
		// sp[0] = gn9;
		// sp[1] = v40;
		// for (int i = 0; i < sp.length; i++) {
		// sp[i].printMaker();
		// sp[i].makeaCall();
		// sp[i].takeaCall();
		// sp[i].touch();
		// sp[i].charge();
		// sp[i].picture();
		//
		// System.out.println();
		// }

		// jo_project ��Ű��
		MainMenu mm = new MainMenu();
		mm.mainMenu();
	}
}
