public class Car {
    int wheel;
    Engine engine;
    int doors;

    Car() {
        engine = new Engine("Toyota", "V8");
        wheel = 4;
        doors = 4;
        System.out.println("Сейчас был создан автомобиль. У него " + wheel + " колеса.");
        System.out.println(engine);
        engine.start();
    }
}
