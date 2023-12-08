package task.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        List<Person> collection = new ArrayList<>();
        collection.add(new Person(2, "Vasya", "Biletskiy", 17));
        collection.add(new Person(7, "Artur", "Koval", 17));
        collection.add(new Person(8, "Olexander", "Volodko", 21));
        collection.add(new Person(9, "Danya", "Martynyuk", 24));
        collection.add(new Person(4, "Dima", "Kapitan", 22));
        collection.add(new Person(10, "Ruslan", "Tretyak", 28));
        collection.add(new Person(5, "Masha", "Blyznyuk", 19));
        collection.add(new Person(1, "Roma", "Pravnyk", 19));
        collection.add(new Person(6, "Dasha", "Levina", 18));
        collection.add(new Person(3, "Andriy", "Ivanchuk", 20));
        System.out.println("\nДо сортування: ");
        for (Person p : collection) {
            System.out.println(p);
        }
        System.out.println("\nПісля сортування Comparator: ");
        Collections.sort(collection,new ComparatorExm());
        for (Person p : collection) {
            System.out.println(p);
        }
        System.out.println("\nПісля сортування Comparable: ");
        Collections.sort(collection);
        for (Person p : collection) {
            System.out.println(p);
        }


    }
}
