public class Cube {
	private int length;

	public Cube (int edgeLength) {
		this.length = edgeLength;
	}

	public int volume() {
		return this.length * this.length * this.length;
	}

	public String toString() {
		// "The length of the edge is l and the volume v"
		return "The length of the edge is " + this.length + " and the volume " + this.volume();
	}
}
