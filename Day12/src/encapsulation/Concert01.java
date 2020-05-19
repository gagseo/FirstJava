package encapsulation;

public class Concert01 {

	public void concertPlaying() {
		System.out.println("콘서트 1입니다.");
		Player p = new Player();
		// p.prepare();
		// p.start();
		// p.playing();
		// p.end();
		p.play();
	}
}
