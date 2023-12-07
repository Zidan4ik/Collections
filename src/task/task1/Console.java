package task.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    public void doConsole() {
        List<String> gos_number = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String num = "";
        String key = "";
        while (!key.equals("stop")) {
            if (key.equals("list")) {
                for (String l : gos_number) {
                    System.out.println(l);
                }
            }
            else if(key.equals("add")) {
                System.out.println("Введіть номер для авто: ");
                num = scanner.nextLine();
                if (num.length() == 8) {
                    gos_number.add(num);
                } else {
                    System.out.println("ваш номер не має входить в номерні знаки автомобілів України");
                }
            }
            System.out.println("Введіть ключове слово: ");
            key = scanner.nextLine();
        }
    }
}

