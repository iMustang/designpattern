package filter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("xMustang", "M"));
        people.add(new Person("Horse", "F"));
        people.add(new Person("xiaoming", "M"));
        List<Person> personList = new GenderCriteria().meetCriteria(people);
        System.out.println(personList);
    }
}
