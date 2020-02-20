public class Vehicle {
    private String name;
    private double tankCapacity;
    private double averageFuelOn100;

    public double getAverageFuelOn100() {
        return averageFuelOn100;
    }

    public double totalConsumption() {
        return averageFuelOn100;
    }

    public Vehicle(String name, double tankCapacity, double averageFuelOn100) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageFuelOn100 = averageFuelOn100;
    }

    public double range() {
        return 100*(tankCapacity / totalConsumption());
    }

    public void setAC(boolean AC) {
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void showInfo() {
        System.out.println("\nName: " + name);
        System.out.println("Capacity of tank: " + tankCapacity + "L");
        System.out.printf("Avarage fuel consumption on 100km: %.2fL\n", totalConsumption());
        System.out.printf("Range: %.2f km\n", range());

    }
}
