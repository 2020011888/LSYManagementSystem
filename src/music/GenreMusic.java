package music;

public class GenreMusic extends Music {
	private String Genre;
	
	public String getGenre() {
		return Genre;
	}
	
	public void setGenre(String Genre) {
		this.Genre = Genre;
	}
	
	public void printGenre(){
		System.out.println(getSong() + " of " + getName() + "(" + getGenre()+ ")");
	}
}
