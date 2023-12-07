package structure.example.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        List<Transport> arrayTransport = new ArrayList<>();
        arrayTransport.add(new Plane("plane1"));
        arrayTransport.add(new Plane("plane2"));
        arrayTransport.add(new Car("car1"));
        arrayTransport.add(new Car("car2"));

        showDoTransport(arrayTransport);
    }

    public static void showDoTransport(List<? super Transport> arrayInput) {
        for (Object t : arrayInput) {
            if(t instanceof Car){
                ((Car) t).act();
            }else if(t instanceof Plane){
                ((Plane)t).act();
            }else{
                System.out.println();
            }
        }
    }
}
