public class Car {
    String make;
    String model;
    String color;

    public void accelerate() {
        System.out.println("The car is accelarating");
    }

    public void turn() {
        System.out.println("The car is turning");
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                "model='" + model + '\'' +
                "color='" + color + '\'' +
                '}';
    }
}
