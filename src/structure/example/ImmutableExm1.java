package structure.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableExm1 {
    public static void main(String[] args) {
        List array = new ArrayList<>();
        array.add("Roma");
        array.add("Dima");
        array.add("Dasha");
        array.add("Vasya");


        List immutableArray = Collections.unmodifiableList(array);

        array.add("Ruslan");
        System.out.println("Before: "+array);
        System.out.println("After: "+immutableArray);
    }
}
