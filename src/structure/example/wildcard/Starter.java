package structure.example.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        List<? super Transport> arrayTransport1 = new ArrayList<>();
        List<? extends Transport> arrayTransport2 = new ArrayList<>();

        arrayTransport1.add(new Plane("plane1"));
        arrayTransport1.add(new Plane("plane2"));
        arrayTransport1.add(new Car("car1"));
//        arrayTransport2.add(new Car("car2"));

        showDoTransport(arrayTransport1);

    }

    public static void showDoTransport(List<?> arrayInput) {
        for (Object t : arrayInput) {
            if (t instanceof Transport) {
//                System.out.println(t.getClass());
                ((Transport) t).act();
            }
        }
    }
}
