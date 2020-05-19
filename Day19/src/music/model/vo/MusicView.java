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
		// 메인매뉴

		while (true) {
			System.out.println("*******메인 메뉴*******");
			System.out.println("1. 곡추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 정렬하여 조회");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 수정");
			System.out.println("0. 종료");
			System.out.println("메뉴 번호 선택 : ");
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
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}

		}

	}

	public void sortMenu() {
		// 정렬용 서브메뉴
		System.out.println("*******정렬용 메뉴*******");
		System.out.println("1. 가수명 별 오름차순 정렬");
		System.out.println("2. 곡명 별 오름차순 정렬");
		System.out.println("3. 가수명 별 내림차순 정렬");
		System.out.println("4. 곡명 별 내림차순 정렬");
		System.out.println("메뉴 번호 선택 : ");
		int menu = sc.nextInt();

		ascDesc(menu);

	}

	public void addList() {
		// 곡 추가
		System.out.println("------- 새로운 곡 추가 -------");
		System.out.println("가수를 입력해주세요 : ");
		String artist = sc.nextLine();
		System.out.println("곡명을 입력해주세요 : ");
		String title = sc.nextLine();

		mc.addList(new Music(artist, title));

	}

	public void selectList() {
		// 전체 조회
		System.out.println("------- 전체 곡 목록 조회 -------");

		// MusicController의 selectList() 메소드 호출하여 ArrayList<Music> 전달받음
		// 전달 받은 list가 비어 있지 않을 경우 -> 조건식에 list의 isEmpty()사용
		if (mc.selectList().isEmpty()) {
			System.out.println("목록이 존재하지 않습니다.");
		} else {
			for (int i = 0; i < mc.selectList().size(); i++) {
				System.out.println(mc.selectList().get(i));
			}
		}
		// for문을 이용하여 list 전체 출력 -> 출력문에 list의 get(index)사용

		// 비어있을 경우 ->"목록이 존재하지 않습니다." 출력

	}

	public void ascDesc(int num) {
		// 정렬 조회
		System.out.println("-------- 정렬하여 조회 -------");

		ArrayList<Music> sortList = new ArrayList<Music>();
		sortList.addAll(mc.selectList());

		switch (num) {
		case 1:
			Collections.sort(sortList); // 오름차순
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
		// 곡 검색
		System.out.println("------- 특정 곡 검색 -------");
		System.out.println("검색할 곡의 제목을 입력하시오 : ");
		String title = sc.nextLine();
		mc.searchMusic(title);

		if (mc.selectList().isEmpty()) {
			System.out.println("검색한 곡이 없습니다.");
		} else {
			for (int i = 0; i < mc.selectList().size(); i++) {
				if (mc.selectList().get(i).equals(title)) {
					System.out.println(mc.selectList().get(i));
				}
			}

		}

	}

	public void removeMusic() {
		// 곡 삭제
		System.out.println("------- 특정 곡 삭제 -------");
		System.out.println("삭제할 곡의 제목을 입력하시오 : ");
		String title = sc.nextLine();

		int result = 0;

		for (int i = 0; i < mc.selectList().size(); i++) {
			if (mc.selectList().get(i).getTitle().equals(title)) {

				result = mc.removeMusic(title);
			}
		}
		if (result > 0) {
			System.out.println("성공적으로 삭제하였습니다.");
		} else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}

	}

	public void updateMusic() {
		// 곡 수정
		System.out.println("------- 특정 곡 수정 -------");
		System.out.println("수정할 곡의 제목을 입력하시오 : ");
		String title = sc.nextLine();
		System.out.println("수정할 가수명 : ");
		String updateArtist = sc.nextLine();
		System.out.println("수정할 제목명 : ");
		String updateTitle = sc.nextLine();

		Music updateMuic = new Music(updateArtist, updateTitle);

		int result = 0;

		for (int i = 0; i < mc.selectList().size(); i++) {
			if (mc.selectList().get(i).getTitle().equals(title)) {
				result = mc.updateMusic(title, updateMuic);
			} 
		}
		if (result > 0) {
			System.out.println("성공적으로 수정되었습니다.");
		} else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}

	}
}
