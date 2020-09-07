public class Fitbyte {
	private int age;
	private int restingHeartRate;

	public Fitbyte(int age, int restingHeartRate) {
		this.age = age;
		this.restingHeartRate = restingHeartRate;
	}

	public double targetHeartRate(double percentageOfMaximum) {
		double maxHeartRate = 206.3 - (0.711 * this.age);
		// (maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart rate

		return (maxHeartRate - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
	}
}
