package music.controller;

import java.util.ArrayList;

import music.model.vo.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList<Music>();

	public MusicController() {

	}

	public void addList(Music music) {

		list.add(music);

	}

	public ArrayList<Music> selectList() {

		return list;

	}

	public Music searchMusic(String title) {
		Music search = null;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title))
				System.out.println(list.get(i));
		}

		return search;

	}

	public int removeMusic(String title) {
		Music old = null;
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				old = list.remove(i);
				
			}
		}
		
		if (old != null) {
			result = 1;
		}
		return result;

	}

	public int updateMusic(String title, Music updateMusic) {
		Music old = null;
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				old = list.get(i);
				list.set(i, updateMusic);
			}
		}
		if (old != null) {
			result = 1;
		}
		return result;

	}

}
