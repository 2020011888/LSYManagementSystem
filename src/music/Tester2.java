package music;

public class Tester2 {

	public static void main(String[] args) {
		Music[] music = new Music[3];
		
		for(int i = 0; i < music.length; i++) {
			music[i] = new GenreMusic();
		}
		music[0].setName("Beethoven");
		music[0].setSong("Destiny");
		((GenreMusic) music[0]).setGenre("Symphony");
		
		music[1].setName("Handel");
		music[1].setSong("Messiah");
		((GenreMusic) music[1]).setGenre("Oratorio");
		
		music[2].setName("Vivaldi");
		music[2].setSong("Four Seasons");
		((GenreMusic) music[2]).setGenre("Concerto");
		
		System.out.println("  < Play List >  ");
		for(int i = 0; i < music.length; i++) {
			music[i].printPlaydata();
			((GenreMusic) music[i]).printGenre();
		}
	}
}
