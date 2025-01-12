package Transport;

public class Car implements Transport {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println("Машина едет");
    }
}
