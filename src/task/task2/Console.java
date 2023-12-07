package task.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {

    public void doConsole() {
        List<String> gos_number = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String num = "";
        String key = "";
        int index = 0;

        while (!key.equals("stop")) {
            if (key.equals("list")) {
                for(int i=0;i<gos_number.size();i++){
                    System.out.println(i+" | "+gos_number.get(i));
                }
            } else if (key.equals("add")) {
                System.out.println("Введіть номер для авто: ");
                num = scanner.nextLine();
                System.out.println("Введіть позицію на яку ви хочете записати номер автомобіля: ");
                index = Integer.parseInt(scanner.nextLine());
                if(index<=gos_number.size()){
                    if (num.length() == 8) {
                        gos_number.add(index,num);
                    } else {
                        System.out.println("ваш номер не має входить в номерні знаки автомобілів України");
                    }
                }
                else if(index>gos_number.size()){
                    if (num.length() == 8) {
                        gos_number.add(num);
                    } else {
                        System.out.println("ваш номер не має входить в номерні знаки автомобілів України");
                    }
                }
            }

            System.out.println("Введіть ключове слово: ");
            key = scanner.nextLine();
        }
        scanner.close();
    }
}
