package music;

public class Music {
	private String name;
	private String song;
	
	public String getName () {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public void printPlaydata() {
		System.out.println(getSong() + " of " + getName());
	}
}
