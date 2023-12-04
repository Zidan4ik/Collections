package sctructure.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExm {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>(); // realization arraylist
        Student s1 = new Student("roma",18);
        Student s2 = new Student("denys",15);
        //method add Object
        l.add(s1);
        l.add(s2);
        l.add(s1);
        System.out.println(l);

        //method remove Object or position
        l.remove(s1);
        l.remove(s2);
        System.out.println(l);

        //method set on position Object
        l.set(1,new Student("masha",19));
        System.out.println(l);

        //method get object
        System.out.println(l.get(1));

        //method check size
        l.size();

        //method contains or no
        System.out.println(l.contains(new Student("roma",19)));

        //remove some object
        ArrayList<Student> l2 = new ArrayList<>();
        l2.add(new Student("roma",18));
        l2.add(new Student("masha",19));
        l.removeAll(l2); //act
        System.out.println(l);

        //method clear collection
        l2.clear();
        //method is empty or no?
        l2.isEmpty();

        //add collection to collection
        l.addAll(l2);
        List<String> l4 = List.of("1","2","3");
        System.out.println(l4);


        //check collection object between
        l.containsAll(l2);

        //check first position object
        l.indexOf(new Student("roma",18));

        //check last position object
        l.lastIndexOf(new Student("roma",18));

        //left element another collection
        l.retainAll(l2);
        l4 = List.copyOf(l4);
        System.out.println(l4);
        System.out.println();



    }
}