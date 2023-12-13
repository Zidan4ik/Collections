package task.task7;


import static task.task7.FunctionsSort.*;


public class Starter {
    public static void main(String[] args) {
        int[] array1 = new int[10_000];
        int[] array2 = new int[10_000];
        int[] array3 = new int[10_000];
        int[] array4 = new int[10_000];
        int[] array5 = new int[10_000];

        addElements(array1);
        addElements(array2);
        addElements(array3);
        addElements(array4);
        addElements(array5);

        sort1(array1); //SORT BY CHOICE
        sort2(array2); //SORT MERGE
        sort3(array3); //SORT QUICK
        sort4(array4); //SORT BUBBLE
        sort5(array5); //SORT INSERT



    }
}
