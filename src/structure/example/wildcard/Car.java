package structure.example.wildcard;

public class Car extends Transport{
    private String type;

    public Car(String type) {
        this.type = type;
    }

    public void act(){
        System.out.println(type+" їде по дорозі");
    }
}
