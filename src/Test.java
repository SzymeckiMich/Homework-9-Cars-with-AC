public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Truck("Jelcz", 150, 10, false, 100);
        vehicles[1] = new Car("VW", 200, 10, false);

        for (Vehicle vehicle : vehicles) {
            vehicle.showInfo();
        }
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].setAC(true);
        }

        for (Vehicle vehicle : vehicles) {
            vehicle.showInfo();
        }
    }
}
