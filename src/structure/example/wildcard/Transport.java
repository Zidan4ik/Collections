package structure.example.wildcard;

public class Transport {
    String type;

    public Transport(String type) {
        this.type = type;
    }
    public void act() {
        System.out.println(type + " рухається");
    }
}
