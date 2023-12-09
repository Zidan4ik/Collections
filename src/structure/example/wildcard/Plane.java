package structure.example.wildcard;

public class Plane extends Transport {

    public Plane(String type) {
        super(type);
    }

    @Override
    public void act() {
        System.out.println(type + " летить у повітрі");
    }
}
