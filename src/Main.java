public class Main {
    public static void main(String[] args) {
        Car colorado = new Car();
        colorado.make = "Chevrolet";
        colorado.model = "Colorado";
        colorado.color = "Red";
        
        Car mustang = new Car();
        mustang.make = "Ford";
        mustang.model = "Mustang";
        mustang.color = "Blue";

        colorado.accelerate();
        mustang.turn();

        System.err.println(colorado);
        System.err.println(mustang);
    }
}
