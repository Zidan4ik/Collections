package task.task4;

import java.util.*;

public class Console {
    public void doConsole() {
        Map<String, String> gos_number = new HashMap();
        Scanner scanner = new Scanner(System.in);

        String num = "";
        String name = "";

        String key = "";
        while (!key.equals("stop")) {
            if (key.equals("list")) {
                for (Map.Entry<String, String> l : gos_number.entrySet()) {
                    System.out.println("Власник: " + l.getValue() + " | номер автомобіля: " + l.getKey());
                }
            } else if (key.equals("cars")) {
                for (Map.Entry<String, String> l : gos_number.entrySet()) {
                    System.out.println("Номер автомобіля: " + l.getKey());
                }
            } else if (key.equals("own")) {
                Set<String> personalName = new HashSet<>();
                Map<String,Integer> countNumber = new HashMap();

                int count = 0;
                for (Map.Entry<String, String> l : gos_number.entrySet()) {
                    personalName.add(l.getValue());
                }

                for(String n: personalName){
                    for (Map.Entry<String, String> l : gos_number.entrySet()) {
                        if(n.equals(l.getValue())){
                            count++;
                        }
                    }
                    countNumber.put(n,count);
                    count=0;
                }

                for(Map.Entry<String,Integer> l: countNumber.entrySet()){
                    System.out.println("Власник: "+l.getKey()+" | к-сть автомобільних номерів: "+l.getValue());
                }
            } else if (key.equals("add")) {
                System.out.println("Введіть номер для авто: ");
                num = scanner.nextLine();
                System.out.println("Введіть власника автомобіля: ");
                name = scanner.nextLine();

                if (num.length() == 8) {
                    gos_number.put(num, name);
                } else {
                    System.out.println("ваш номер не має входить в номерні знаки автомобілів України");
                }
            }
            System.out.println("Введіть ключове слово: ");
            key = scanner.nextLine();
        }
        scanner.close();
    }
}
