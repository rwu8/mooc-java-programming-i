public class Timer {
	private ClockHand hundreths;
	private ClockHand seconds;

	public Timer() {
		this.hundreths = new ClockHand(100);
		this.seconds = new ClockHand(60);
	}

	public String toString() {
		return this.seconds + ":" + this.hundreths;
	}

	public void advance() {
		this.hundreths.advance();

		if (this.hundreths.value() == 0) {
			this.seconds.advance();
		}
	}
}
