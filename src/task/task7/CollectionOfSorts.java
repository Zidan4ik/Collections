package task.task7;

import java.util.ArrayList;
import java.util.List;

public class CollectionOfSorts {

    public static List<Integer> sort1(List<Integer> list){

        for(int i=0;i<list.size();i++){
            for(int k=i+1;k<list.size();k++){

                if(list.get(i)>list.get(k)){
                    int value = list.get(i);
                    list.set(i,list.get(k));
                    list.set(k,value);
                }
            }
        }
        return list;
    }


    public static void sort2(){
    }
    public static void merge(int[] arr1, int startIndex1, int[] arr2, int startIndex2,
                             int[] dest, int destStart, int size){  // процедура злиття
        int index1 = startIndex1;
        int index2 = startIndex2;

        int endIndex1 = Math.min(startIndex1+size,arr1.length);
        int endIndex2 = Math.min(startIndex2+size,arr2.length);

        int iteration = (startIndex1-endIndex1)+(startIndex2-endIndex2);
        for(int i=destStart;i<destStart+iteration;i++){
            if(index1<endIndex1 && (index2 >= endIndex2 || arr1[index1]<arr2[index2])){
                // (index2>=endIndex2) обробка ситуацій, коли елементи закінч в одному з масивів
                // (arr1[index1]<arr2[index2])) порівняння
                //
                dest[i]=arr1[index1];
                index1++;
            }else{
                dest[i]=arr2[index2];
                index2++;
            }
        }
    }

    public static int[] mergeSort(int[] array){
        int[] tmp; // посередник
        int[] currentSrc = array; // масив, де зливаємо підмасиви з друг другом
        int[] currentDest = new int [array.length]; // масив-приймач, де записується масиви, після злиття

        int size = 1; // розмір масива, що буде збільшуватись в (size*2), після злиття
        while(size<array.length){
            for(int i=0;i<array.length; i+=2*size){
                merge(currentSrc,i,currentSrc,i+size,currentDest,i,size);
            }
            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;

        }
        return currentSrc;
    }
}
