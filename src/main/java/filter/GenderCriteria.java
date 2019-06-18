package filter;

import java.util.ArrayList;
import java.util.List;

public class GenderCriteria implements Criteria<Person> {
    @Override
    public List<Person> meetCriteria(List<Person> input) {
        List<Person> personList = new ArrayList<>();
        for (Person person : input) {
            if ("M".equals(person.getGender())) {
                personList.add(person);
            }
        }
        return personList;
    }
}
