package structure.example.wildcard;

public class Car extends Transport{
    public Car(String type) {
        super(type);
    }
    @Override
    public void act(){
        System.out.println(type+" їде по дорозі");
    }
}
