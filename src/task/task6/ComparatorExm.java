package task.task6;

import java.util.Comparator;

public class ComparatorExm implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.compareTo(o2);
    }
}
