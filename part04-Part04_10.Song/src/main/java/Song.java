public class Song {
	private String name;
	private Integer length;

	public Song(String name, int length) {
		this.name = name;
		this.length = length;
	}

	public String name() {
		return this.name;
	}

	public int length() {
		return this.length;
	}
}
