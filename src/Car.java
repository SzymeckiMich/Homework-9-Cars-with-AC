public class Car extends Vehicle {
    private boolean AC;
    private double consumptionWithAC = 0.8;


    public Car(String name, double tankCapacity, double averageFuelOn100, boolean AC) {
        super(name, tankCapacity, averageFuelOn100);
        this.AC = AC;
    }

    @Override
    public double totalConsumption() {
        if (AC) {
            return super.totalConsumption() + consumptionWithAC;
        } else {
            return super.totalConsumption();
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Is air condition ON: " + AC);
    }

    public boolean isAC() {
        return AC;
    }

    @Override
    public void setAC(boolean AC) {
        this.AC = AC;
    }

}
