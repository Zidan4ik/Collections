package task.task7;


public class FunctionsSort {
    /* ********************************** SORT BY CHOICE *************************** */
    public static int[] sort1(int[] arr) { //
        double start = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] < arr[i]) {
                    int num = arr[i];
                    arr[i] = arr[k];
                    arr[k] = num;
                }
            }
        }
        double end = System.nanoTime();
        System.out.println("Затрачений час на сортування: "+(end-start)/1e6 +" мілісекунд");
        return arr;
    }

    /* ********************************** SORT MERGE *************************** */
    public static void sort2(int array[]) {
        double start = System.nanoTime();
        mergeSort(array);
        double end = System.nanoTime();
        System.out.println("Затрачений час на сортування: "+(end-start)/1e6 +" мілісекунд");
    }

    /* ********************************** SORT QUICK *************************** */
    public static void sort3(int array[]) {
        double start = System.nanoTime();
        quickSort(array, 0, array.length - 1);
        double end = System.nanoTime();
        System.out.println("Затрачений час на сортування: "+(end-start)/1e6 +" мілісекунд");
    }

    /* ********************************** SORT BUBBLE *************************** */
    public static void sort4(int[] array) {
        double start = System.nanoTime();
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int num = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = num;
                    flag = true;
                }
            }
        }
        double end = System.nanoTime();
        System.out.println("Затрачений час на сортування: "+(end-start)/1e6 +" мілісекунд");
    }

    /* ********************************** SORT INSERT *************************** */
    public static void sort5(int[] arr) {
        double start = System.nanoTime();
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int index = i;
            while (index > 0 && arr[index - 1] > currentValue) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = currentValue;
        }
        double end = System.nanoTime();
        System.out.println("Затрачений час на сортування: "+(end-start)/1e6 +" мілісекунд");
    }

    /* ********************************** ANOTHER CODE *************************** */

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) { //iteration on all elements
            int divideIndex = findPosition(arr, start, end);
            quickSort(arr, start, divideIndex - 1);
            quickSort(arr, divideIndex, end);
        }
    }

    private static int findPosition(int[] arr, int start, int end) {
        int left = start;
        int right = end;

        int pivot = arr[start];
        while (left <= right) {
            while (arr[left] < pivot) { // all numbers less than pivot
                left++;
            }
            while (arr[right] > pivot) { // all numbers greater than pivot
                right--;
            }
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] arr, int left, int right) {
        int num = arr[left];
        arr[left] = arr[right];
        arr[right] = num;
    }


    public static void mergeSort(int array[]) {//
        int arr = array.length; //
        if (arr == 1) return;
        int mid = arr / 2;

        int[] part1 = new int[mid];
        int[] part2 = new int[arr - mid];

        for (int i = 0; i < mid; i++) {  // copy elements
            part1[i] = array[i];
        }
        for (int i = mid; i < arr; i++) { // copy elements
            part2[i - mid] = array[i];
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
    }

    public static void addElements(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)Math.round(Math.random()*50+3);
        }
    }
}
