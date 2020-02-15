public class Truck extends Car {
    private double loadWeight;
    private double ConsumptionWithLoad = 0.5;

    public Truck(String name, double tankCapacity, double averageFuelOn100, boolean AC, double load) {
        super(name, tankCapacity, averageFuelOn100, AC);
        this.loadWeight = load;
    }

    @Override
    public double totalConsumption() {
        if (isAC()) {
            return (super.totalConsumption() + 0.8 + (((int) (loadWeight / 100)) * ConsumptionWithLoad));
        } else {
            return (super.totalConsumption() + (((int) (loadWeight / 100)) * ConsumptionWithLoad));
        }
    }

    @Override
    public double range() {
        return (getTankCapacity() / totalConsumption());
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight of load: " + loadWeight + "km");
    }

}
