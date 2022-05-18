public class Engine {
    String model;
    String volume;

    public Engine(String model, String volume) {
        this.model = model;
        this.volume = volume;
    }

    void start() {
        System.out.println("Двигатель заведен");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }
}
