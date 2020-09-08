import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.size() == 0;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person returnPerson = this.persons.get(0);

        for (Person person : persons) {
            if (returnPerson.getHeight() > person.getHeight()) {
                returnPerson = person;
            }
        }

        return returnPerson;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;
    }
}
