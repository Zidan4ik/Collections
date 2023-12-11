package task.task7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static task.task7.CollectionOfSorts.*;


public class Starter {
    public static void main(String[] args) {
        List<Integer> array = List.of(1,2,111111,5,8,12,6,3,1,123,0,-4,221);
        List<Integer> array2 = new ArrayList<>(array);
        System.out.println(sort1(array2));



        int[] arrayInteger = {8,5,12,27,0,2,6,-7,0,3,4,6};
        System.out.println(Arrays.toString(arrayInteger));
        sort2(arrayInteger);
        sort2(new int[]{1,2,111111,5,8,12,6,3,1,123,0,-4,221});

        for(int i=0;i<arrayInteger.length;i++){
            System.out.print(arrayInteger[i] + " ");
        }
    }
}
