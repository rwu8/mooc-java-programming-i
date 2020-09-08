
public class HealthStation {
    private int weighings;

    public HealthStation() {
        this.weighings = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.weighings;
    }
}
