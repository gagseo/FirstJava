package music.model.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import music.controller.MusicController;
import music.model.comparator.AscTitle;
import music.model.comparator.DescArtist;
import music.model.comparator.DescTitle;

public class MusicView {

	Scanner sc = new Scanner(System.in);

	MusicController mc = new MusicController();

	public MusicView() {

	}

	public void mainMenu() {
		// ���θŴ�

		while (true) {
			System.out.println("*******���� �޴�*******");
			System.out.println("1. ���߰�");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. �����Ͽ� ��ȸ");
			System.out.println("4. Ư�� �� �˻�");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ����");
			System.out.println("0. ����");
			System.out.println("�޴� ��ȣ ���� : ");
			int meun = sc.nextInt();
			sc.nextLine();

			switch (meun) {
			case 1:
				addList();
				break;
			case 2:
				selectList();
				break;
			case 3:
				sortMenu();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				updateMusic();
				break;
			case 0:
				System.out.println("���α׷� ����");
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}

		}

	}

	public void sortMenu() {
		// ���Ŀ� ����޴�
		System.out.println("*******���Ŀ� �޴�*******");
		System.out.println("1. ������ �� �������� ����");
		System.out.println("2. ��� �� �������� ����");
		System.out.println("3. ������ �� �������� ����");
		System.out.println("4. ��� �� �������� ����");
		System.out.println("�޴� ��ȣ ���� : ");
		int menu = sc.nextInt();

		ascDesc(menu);

	}

	public void addList() {
		// �� �߰�
		System.out.println("------- ���ο� �� �߰� -------");
		System.out.println("������ �Է����ּ��� : ");
		String artist = sc.nextLine();
		System.out.println("����� �Է����ּ��� : ");
		String title = sc.nextLine();

		mc.addList(new Music(artist, title));

	}

	public void selectList() {
		// ��ü ��ȸ
		System.out.println("------- ��ü �� ��� ��ȸ -------");

		// MusicController�� selectList() �޼ҵ� ȣ���Ͽ� ArrayList<Music> ���޹���
		// ���� ���� list�� ��� ���� ���� ��� -> ���ǽĿ� list�� isEmpty()���
		if (mc.selectList().isEmpty()) {
			System.out.println("����� �������� �ʽ��ϴ�.");
		} else {
			for (int i = 0; i < mc.selectList().size(); i++) {
				System.out.println(mc.selectList().get(i));
			}
		}
		// for���� �̿��Ͽ� list ��ü ��� -> ��¹��� list�� get(index)���

		// ������� ��� ->"����� �������� �ʽ��ϴ�." ���

	}

	public void ascDesc(int num) {
		// ���� ��ȸ
		System.out.println("-------- �����Ͽ� ��ȸ -------");

		ArrayList<Music> sortList = new ArrayList<Music>();
		sortList.addAll(mc.selectList());

		switch (num) {
		case 1:
			Collections.sort(sortList); // ��������
			break;
		case 2:
			Collections.sort(sortList, new AscTitle());
			break;
		case 3:
			Collections.sort(sortList, new DescArtist());
			break;
		case 4:
			Collections.sort(sortList, new DescTitle());
			break;
		}
		for (Music music : sortList) {
			System.out.println(music);
		}

	}

	public void searchMusic() {
		// �� �˻�
		System.out.println("------- Ư�� �� �˻� -------");
		System.out.println("�˻��� ���� ������ �Է��Ͻÿ� : ");
		String title = sc.nextLine();
		mc.searchMusic(title);

		if (mc.selectList().isEmpty()) {
			System.out.println("�˻��� ���� �����ϴ�.");
		} else {
			for (int i = 0; i < mc.selectList().size(); i++) {
				if (mc.selectList().get(i).equals(title)) {
					System.out.println(mc.selectList().get(i));
				}
			}

		}

	}

	public void removeMusic() {
		// �� ����
		System.out.println("------- Ư�� �� ���� -------");
		System.out.println("������ ���� ������ �Է��Ͻÿ� : ");
		String title = sc.nextLine();

		int result = 0;

		for (int i = 0; i < mc.selectList().size(); i++) {
			if (mc.selectList().get(i).getTitle().equals(title)) {

				result = mc.removeMusic(title);
			}
		}
		if (result > 0) {
			System.out.println("���������� �����Ͽ����ϴ�.");
		} else {
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}

	}

	public void updateMusic() {
		// �� ����
		System.out.println("------- Ư�� �� ���� -------");
		System.out.println("������ ���� ������ �Է��Ͻÿ� : ");
		String title = sc.nextLine();
		System.out.println("������ ������ : ");
		String updateArtist = sc.nextLine();
		System.out.println("������ ����� : ");
		String updateTitle = sc.nextLine();

		Music updateMuic = new Music(updateArtist, updateTitle);

		int result = 0;

		for (int i = 0; i < mc.selectList().size(); i++) {
			if (mc.selectList().get(i).getTitle().equals(title)) {
				result = mc.updateMusic(title, updateMuic);
			} 
		}
		if (result > 0) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}

	}
}
