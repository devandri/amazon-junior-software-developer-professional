public class VehicleMain {
    public static void main(String[] args) {

        // Create a Car object using the parameterized constructor
        Truck tesla = new Truck("Tesla", "Model S", "Red");

        // Use inherited methods
        tesla.accelerate();		
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");

        tesla.brake();
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");

        tesla.adjustSeat(2);

    }
}