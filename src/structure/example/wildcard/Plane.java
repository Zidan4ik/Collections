package structure.example.wildcard;

public class Plane extends Transport{
    private String type;

    public Plane(String type) {
        this.type = type;
    }

    public void act(){
        System.out.println(type+" летить у повітрі");
    }
}
