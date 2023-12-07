package structure.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericExm1 {
    public static void main(String[] args) {
        List collectionArrayList = new ArrayList();
        collectionArrayList.add(155);
        collectionArrayList.add("Roma");
        collectionArrayList.add(12.2);
        collectionArrayList.add('s');
        System.out.println(collectionArrayList);
//
//        String variable1 = (String) collectionArrayList.get(3);
//        System.out.println(variable1);

        List<String> collectionArrayList2 = new ArrayList<>();
        collectionArrayList2.add("123");
        String variable2 = collectionArrayList2.get(0);
        System.out.println(variable2);

    }
}
