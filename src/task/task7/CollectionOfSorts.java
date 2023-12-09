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

}
