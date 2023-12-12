package task.task7;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) { //iteration on all elements
            int divideIndex = findPosition(arr, start, end);
            System.out.println(Arrays.toString(arr));
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
            if(left<=right){
                swap(arr,left,right);
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
}
