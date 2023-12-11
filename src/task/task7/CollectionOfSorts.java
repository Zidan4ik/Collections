package task.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOfSorts {

    public static List<Integer> sort1(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int k = i + 1; k < list.size(); k++) {

                if (list.get(i) > list.get(k)) {
                    int value = list.get(i);
                    list.set(i, list.get(k));
                    list.set(k, value);
                }
            }
        }
        return list;
    }


    public static void sort2(int array[]) {
        mergeSort(array);
    }

    public static void mergeSort(int array[]) {//
        int arr = array.length; //
        if(arr == 1) return;
        int mid = arr / 2;

        int[] part1 = new int[mid];
        int[] part2 = new int[arr - mid];

        for (int i = 0; i < mid; i++) {  // copy elements
            part1[i] = array[i];
        }
        for (int i = mid; i < arr; i++) { // copy elements
            part2[i-mid] = array[i];
        }
        mergeSort(part1);
        mergeSort(part2);
        merge(array, part1, part2);

    }

    private static void merge(int arr[], int[] part1, int[] part2) {
        int left = part1.length;
        int right = part2.length;

        int i1 = 0;
        int i2 = 0;
        int idx = 0;
// loop for comparing elements
        while (i1 < left && i2 < right) {
            if (part1[i1] < part2[i2]) {
                arr[idx] = part1[i1];
                i1++;
            } else {
                arr[idx] = part2[i2];
                i2++;
            }
            idx++;
        }
// next two loop recopy another elements for saving structure array
        for (int s1 = i1; s1 < left; s1++) {
            arr[idx++] = part1[s1];
        }
        for (int s2 = i2; s2 < right; s2++) {
            arr[idx++] = part2[s2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
