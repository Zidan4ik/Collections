package task.task5;

import java.util.List;

public class MethodCollection {
    public static double addElements(List<Double> list){
        double begin = System.nanoTime();
        for(int i=0;i<1_000_000;i++){
            double i2 = Math.round(Math.random()*99);
            list.add(i2);
        }
        double complete = System.nanoTime();
        return (complete-begin)/1e9;
    }
    public static double removeElements(List<Double> list,int index){
        for(int i=0;i<=1_000_000;i++){
            double i2 = Math.round(Math.random()*99);
            list.add(i2);
        }
        double begin = System.nanoTime();
        list.remove(index);
        double complete = System.nanoTime();
        return (complete-begin)/1e6;
    }

    public static double addElementByIndex(List<Double> list, int index){
        double begin = System.nanoTime();
        for(int i=0;i<1_000_000;i++){
            double i2 = Math.round(Math.random()*99);
            if(index>list.size()){
                list.add(i2);
            }else if(i<=list.size()){
                list.add(index,i2);
            }
        }
        double complete = System.nanoTime();
        return (complete-begin)/1e9;
    }
    public static double getElementById(List<Double> list,int index){
        for(int i=0;i<=1_000_000;i++){
            double i2 = Math.round(Math.random()*99);
            list.add(i2);
        }
        double begin = System.nanoTime();
        list.get(index);
        double complete = System.nanoTime();
        return (complete-begin)/1e6;
    }
}
