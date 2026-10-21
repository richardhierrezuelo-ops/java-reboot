// Exercise 3: Custom Sorting
//Create a Person class (name, age).
//Sort a list of people by age (youngest first), then by name if ages are equal.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Rick", 35);
        Person p2 = new Person("Portia", 30);
        Person p3 = new Person("Anna", 25);
        Person p4 = new Person("Mike", 30);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        persons.sort(Comparator.comparing(Person::getAge).thenComparing(Person:: getName));

        for (Person person: persons) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
